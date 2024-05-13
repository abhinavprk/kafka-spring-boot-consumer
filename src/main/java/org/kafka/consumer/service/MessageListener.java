package org.kafka.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageListener {

    @KafkaListener(topics = "NDTV", groupId = "news")
    public void consumeMessagesA(String message){
        log.info("Consumer A consumed the message: [ {} ]", message);
    }

    @KafkaListener(topics = "NDTV", groupId = "news")
    public void consumeMessagesB(String message){
        log.info("Consumer B consumed the message: [ {} ]", message);
    }

    @KafkaListener(topics = "NDTV", groupId = "news")
    public void consumeMessagesC(String message){
        log.info("Consumer C consumed the message: [ {} ]", message);
    }

}
