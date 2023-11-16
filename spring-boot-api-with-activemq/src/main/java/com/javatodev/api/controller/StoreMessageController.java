package com.javatodev.api.controller;

import com.javatodev.api.dto.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StoreMessageController {

    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * API for publish message for ActiveMQ queue
     * @param store
     * @return ResponseEntity
     */
    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody Store store){
        try {
            jmsTemplate.convertAndSend("store_msg_queue", store);
            return new ResponseEntity<>("Request Sent", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
