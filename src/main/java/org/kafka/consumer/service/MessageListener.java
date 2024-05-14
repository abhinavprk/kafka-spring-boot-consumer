package org.kafka.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.kafka.producer.dto.Customer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageListener {

    @KafkaListener(topics = "customer", groupId = "my-customer", containerFactory = "kafkaListenerContainerFactory")
    public void consumeMessagesA(Customer message){
        log.info("Consumer A consumed the message: [ {} ]", message);
    }

    @KafkaListener(topics = "customer", groupId = "my-customer",containerFactory = "kafkaListenerContainerFactory")
    public void consumeMessagesB(Customer message){
        log.info("Consumer B consumed the message: [ {} ]", message);
    }

    @KafkaListener(topics = "Cricket", groupId = "my-cricket",containerFactory = "kafkaListenerContainerFactory")
    public void consumeMessagesC(String message){
        log.info("Consumer C consumed the message: [ {} ]", message);
    }

}
