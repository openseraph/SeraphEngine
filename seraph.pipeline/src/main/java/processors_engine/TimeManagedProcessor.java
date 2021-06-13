package processors_engine;

import engine.CurrentAgent;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.streams.processor.Processor;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.state.KeyValueStore;


public class TimeManagedProcessor implements Processor<String, CurrentAgent> {

    private ProcessorContext context;
    private KeyValueStore<String, CurrentAgent> kvStore;
    private KeyValueStore<String, Long> offsetKvStore;
    
    @Override
    @SuppressWarnings("unchecked")
    public void init(ProcessorContext context) {
        this.context = context;
        offsetKvStore = (KeyValueStore) context.getStateStore("offset-store");
        kvStore = (KeyValueStore) context.getStateStore("agent-store-time-managed");

    }

    @Override
    public void process(String key, CurrentAgent currentAgent) {
        //todo handle "key", "value" and topicNames
        if(currentAgent.getAgentName().equals(TickerProcessor.class.getSimpleName())) {
            Long offsetToRead = TimeManagedConsumer_2.delayedStream_seek
                    (new TopicPartition("tmpDeleteTopic", 0),
                            "DelayedDelete", currentAgent.getTimestamp_to_sync(), this.offsetKvStore.get("value"));
//            System.err.println("KKKKKK Offset to read TimeManaged: " +  offsetToRead);
            this.offsetKvStore.put("value", offsetToRead);
    
            CurrentAgent updatedAgent = new CurrentAgent(this.getClass().getSimpleName(),
                    "completed", currentAgent.getTimestamp_to_sync());
            this.kvStore.put("key", updatedAgent);
            context.forward("key",updatedAgent);
            context.commit();
        }
    }

    @Override
    public void close() { }
}
