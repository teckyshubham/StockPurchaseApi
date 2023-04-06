package com.example.StockPurchase.kafka;

import com.example.BaseConfig.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(
            topics = "CodeDecodeTopic",
            groupId = "CodeGroup1"
    )
    public void consume(OrderEvent event){
        System.out.println(event + "Consumer 2 and topic 2");
    }
}
