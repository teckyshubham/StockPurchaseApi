package com.example.EmailService.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private KafkaTemplate<String ,OrderConsumer> kafkaTemplate;

    @KafkaListener(topics = "CodeDecodeTopic", groupId = "codedecode-group")
    public void listenToCodeDecodeKafkaTopic(String messageReceived){
        System.out.println("Message received is" + messageReceived);
    }
}
