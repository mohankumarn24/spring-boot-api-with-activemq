package com.javatodev.api.controller;

import com.javatodev.api.dto.Store;
import com.javatodev.api.producer.StoreMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StoreMessageController {

    @Autowired
    StoreMessageProducer storeMessageProducer;

    // API for publish message for ActiveMQ queue
    @PostMapping("/publish")
    public String publishMessage(@RequestBody Store store){
        storeMessageProducer.publish(store);
        return "Success";
    }
}
