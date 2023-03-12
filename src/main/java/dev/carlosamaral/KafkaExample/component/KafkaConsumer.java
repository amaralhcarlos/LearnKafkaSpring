package dev.carlosamaral.KafkaExample.component;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


    @KafkaListener(topics = "${topic.name.producer}", groupId = "${spring.kafka.producer.group-id}")
    private void consume(ConsumerRecord<String, String> message) {

        System.out.println("Recebi " + message);
        
    }

}
