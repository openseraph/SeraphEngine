package processors;

import config.KafkaConfigProperties;
import engine.CurrentAgent;
import engine.SeraphQueryParser;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.streams.processor.Processor;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.state.KeyValueStore;


public class TickerProcessorEvent implements Processor<String, CurrentAgent> {

    private ProcessorContext context;
    private KeyValueStore<String, CurrentAgent> kvStore;
    private KeyValueStore<String, Long> offsetKvStore;
    private Long[] timestampToSync_offsetToRead;
    private final Long EVENT_RANGE = 5L;



    @Override
    @SuppressWarnings("unchecked")
    public void init(ProcessorContext context) {
        this.context = context;
        offsetKvStore = (KeyValueStore) context.getStateStore("offset-store2");
        this.timestampToSync_offsetToRead = new Long[2];
        kvStore = (KeyValueStore) context.getStateStore("agent-store2");
        CurrentAgent agent = new CurrentAgent(this.getClass().getSimpleName(),
                "started", 0L);
        Producer<String, CurrentAgent> kafkaProducer = new KafkaProducer<>(KafkaConfigProperties.getKafkaProducerProperties());
        kafkaProducer.send(new ProducerRecord<>("processor-topic1", agent));
        kafkaProducer.flush();
        kafkaProducer.close();
    }


    @Override
    public void process(String key, CurrentAgent currentAgent) {
        //todo handle "key", "value" and topicNames
        if (currentAgent.getAgentName().equals(SeraphQueryParser.class.getSimpleName())
                && currentAgent.getStatus().equals("completed")){
            CurrentAgent updatedAgent = new CurrentAgent(this.getClass().getSimpleName(),
                    "completed", currentAgent.getTimestamp_to_sync());
            this.kvStore.put("key", updatedAgent);
            this.context.forward("key", updatedAgent);
            this.context.commit();

        }
        if(currentAgent.getAgentName().equals(CypherHandlerProcessor.class.getSimpleName())
                && currentAgent.getStatus().equals("completed")){
            this.timestampToSync_offsetToRead = TickerEventInputReader.readCreateEvent
                    (new TopicPartition("relationships", 0),
                            EVENT_RANGE, this.offsetKvStore.get("value-ticker-event"));

            Long timestampToSync = this.timestampToSync_offsetToRead[0];
            Long offsetToRead = this.timestampToSync_offsetToRead[1];

            this.offsetKvStore.put("value-ticker-event", offsetToRead);
            CurrentAgent updatedAgent = new CurrentAgent(this.getClass().getSimpleName(),
                    "completed", timestampToSync);
            this.kvStore.put("key", updatedAgent);
            context.forward("key",updatedAgent);
            context.commit();
        }
    }


    @Override
    public void close() { }
}