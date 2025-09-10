package com.javatodev.api.producer;

import com.javatodev.api.dto.Store;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StoreMessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${activemq.destination}")
    private String destination;

    // Convert and publish the message to the queue
    public void publish(Store store) {
        jmsTemplate.convertAndSend(destination, store);
        log.info("Producer: Message Sent");
    }
}
