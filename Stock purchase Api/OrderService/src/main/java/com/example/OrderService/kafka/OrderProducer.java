package com.example.OrderService.kafka;

import com.example.BaseConfig.OrderEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    @Autowired
    private KafkaTemplate<String , OrderEvent> kafkaTemplate;

    public OrderProducer(NewTopic topic , KafkaTemplate<String , OrderEvent> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(OrderEvent event){
        System.out.println(event);
        kafkaTemplate.send("CodeDecodeTopic" , event);
    }
}
