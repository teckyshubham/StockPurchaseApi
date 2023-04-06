package com.example.OrderService.controller;

import com.example.BaseConfig.Order;
import com.example.BaseConfig.OrderEvent;
import com.example.OrderService.kafka.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderController {
    private OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer){
        this.orderProducer = orderProducer;
    }
    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order){
        System.out.println(order);

        OrderEvent event = new OrderEvent();
        event.message = "Producer1";
        event.order = "Order 1";
        event.status = "succesful";
        System.out.println(event);
        orderProducer.sendMessage(event);

        return "Order placed successful...";
    }

}
