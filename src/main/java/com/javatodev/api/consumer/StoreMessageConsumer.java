package com.javatodev.api.consumer;

import com.javatodev.api.dto.Store;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StoreMessageConsumer {

    // Message Listener of ActiveMQ queue
    @JmsListener(destination = "${activemq.destination}", containerFactory = "jmsFactory")
    public void processToDo(Store store) {
        log.info("Consumer: " + store);
    }
}
