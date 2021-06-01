package engine;

import org.json.JSONObject;
import org.neo4j.driver.Record;
import org.neo4j.driver.*;
import org.neo4j.driver.internal.value.NodeValue;
import org.neo4j.driver.internal.value.RelationshipValue;
import org.neo4j.driver.util.Pair;
import stateStore.PubSubRedisStateStore;

import java.util.List;

public class CypherQueryHandler extends Thread implements AutoCloseable{

    private final Driver driver;
    private final String cypherQuery;
    private final String kafkaTopic;
    private final String registeredQueryName;
    private final PubSubRedisStateStore stateStore;
    private final CurrentAgent currentAgent;




    public CypherQueryHandler(String uri, String user, String password, QueryConfiguration qc, CurrentAgent currentAgent)
    {
        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );
        this.cypherQuery = qc.getCypherQuery();
        this.kafkaTopic = qc.getOutput_topic();
        this.currentAgent = currentAgent;
        this.registeredQueryName = qc.getRegisteredQueryName();
        this.stateStore = new PubSubRedisStateStore(this.currentAgent);
        this.stateStore.subscribeChannel(this.registeredQueryName);
    }


    public JSONObject runQuery() {
        try (Session session = driver.session()) {
            Result result = session.run(this.cypherQuery);
            JSONObject jsonResultRecord = null;
            CypherResultRecord cypherResultRecord;

            if (result.hasNext())
                cypherResultRecord = checkRecordType(result.peek().fields());
            else return null;

            while (result.hasNext()) {
                Record record = result.next();
                jsonResultRecord = cypherResultRecord != null ? cypherResultRecord.produceRecord(record.fields()) : null;

            }

            return jsonResultRecord;
        }
    }

    private CypherResultRecord checkRecordType(List<Pair<String, Value>> fields) {
        CypherResultRecord cypherResultRecord = new CypherResultRecord();
        boolean propertyGraph_flag = false;
        boolean projection_flag = false;
        boolean exception_flag = false;

        if(fields.stream().anyMatch(v -> v.value() instanceof NodeValue)
                || fields.stream().anyMatch(v -> v.value() instanceof RelationshipValue))
            propertyGraph_flag = true;
        if (fields.stream().anyMatch(v -> cypherResultRecord.getExceptionTypeList().contains(v.value().getClass())))
            exception_flag = true;
        if (fields.stream().anyMatch(v -> cypherResultRecord.getAllowedTypeList().contains(v.value().getClass())))
            projection_flag = true;

        if (exception_flag)
            return new ExceptionCypherResult();         //TODO handle exception case
        else if(propertyGraph_flag && projection_flag)
            return null;                                //TODO handle this case
        else if(propertyGraph_flag)
            return new PropertyGraphResultRecord();
        else if (projection_flag)
            return new ProjectionResultRecord();
        else return null;
    }



    @Override
    public void close() { driver.close(); }

    /*
    public void run() {
        System.out.println("Query Handler Thread started");
        PubSubRedisStateStore stateStore = new PubSubRedisStateStore();
        while (PubSubRedisStateStore.getAgentName() != null) {
            stateStore.readState(DeleteStreamProducer.class.getName());
                System.err.println("PPPPPPPPP: " + PubSubRedisStateStore.getAgentName());
                while (!PubSubRedisStateStore.getAgentName().equals("completed")) {
                    try {
                        synchronized (monitor) {
                            monitor.wait();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                while (PubSubRedisStateStore.getAgentName().equals("completed")) {
                    System.err.println("HHH: " + PubSubRedisStateStore.getAgentName());
                    JSONObject jsonQueryResult = runQuery();
                    if (jsonQueryResult == null)
                        System.err.println("Null query result");
                    else KafkaResultProducer.producerResultRecord(this.kafkaTopic, jsonQueryResult);
                }
        }
    }
     */

    /*public void run() {
        this.stateStore.readState("globalStateStore");
        while (true) {
            synchronized (monitor) {
                    while (!CurrentAgent.getCurrentAgent().equals(DelayedConsumer.class.getName())) {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    monitor.notifyAll();
                    System.err.println("HHH_CypherHandler: " + CurrentAgent.getCurrentAgent());
                    JSONObject jsonQueryResult = runQuery();
                    if (jsonQueryResult == null)
                        System.err.println("Null query result");
                    else KafkaResultProducer.producerResultRecord(this.kafkaTopic, jsonQueryResult);
                }
        }
    }*/


    public void run(){
        this.stateStore.subscribeChannel("globalStateStore");
        while (!isInterrupted()){
            synchronized (currentAgent){
                if(currentAgent.getAgentName().equals("DelayedConsumer") && currentAgent.getStatus().equals("completed")){
                    this.currentAgent.updateCurrentAgent("CypherHandler", "started", System.currentTimeMillis());
                    this.stateStore.writeState("globalStateStore", this.currentAgent);
                    //blocco lavoro
                    this.currentAgent.updateCurrentAgent("CypherHandler", "completed", System.currentTimeMillis());
                    this.stateStore.writeState("globalStateStore", this.currentAgent);
                    System.err.println("YYY_CypherHandler:  " + "CypherHandler completed");
                }
                currentAgent.notifyAll();
                try {
                    currentAgent.wait();
                } catch (InterruptedException e) {
                    /*TODO
                    writeState(Cypher completed or interrupted)
                     */
                    e.printStackTrace();
                    interrupt();
                }
            }
        }
    }
}
