package processors;

import config.KafkaConfigProperties;
import engine.Neo4jObj;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.TopicPartition;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.time.Duration;
import java.util.Collections;


public class TickerEventInputReader {

    static Long[] readCreateEvent(TopicPartition topicPartition, Long eventRange, Long offset_to_read) {

        ConsumerFactory<String, Neo4jObj> cf = new DefaultKafkaConsumerFactory<>(KafkaConfigProperties.getKafkaConsumerProperties(Neo4jObj.class));
        Consumer<String, Neo4jObj> consumer = cf.createConsumer();
        consumer.assign(Collections.singletonList(topicPartition));

        Producer<String, Neo4jObj> producer = new KafkaProducer<>(KafkaConfigProperties.getKafkaProducerProperties());

        if(offset_to_read==null)
            offset_to_read=consumer.beginningOffsets(Collections.singletonList(topicPartition)).get(topicPartition);


        consumer.seek(topicPartition, offset_to_read);
        Long counter=0L;
        Long[] return_values = new Long[2];
        while (true) {
            ConsumerRecords<String, Neo4jObj> records = consumer.poll(Duration.ofMillis(100));
            if (!records.isEmpty()) {
                for (ConsumerRecord<String, Neo4jObj> r : records.records(topicPartition)) {
                    if (counter<eventRange) {
                        counter++;
                        offset_to_read = r.offset() + 1;
                    }
                    else{
                        return_values[0] = r.timestamp();
                        return_values[1] = offset_to_read;
                        return return_values;
                    }
                }
            }
//            else if(timestampToSync < System.currentTimeMillis())     //todo handle case
//                return offset_to_read;
        }

    }

}