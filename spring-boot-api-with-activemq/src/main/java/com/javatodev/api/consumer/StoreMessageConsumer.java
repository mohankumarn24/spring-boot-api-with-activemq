package com.javatodev.api.consumer;

import com.javatodev.api.dto.Store;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StoreMessageConsumer {

    /**
     * Message Listener of ActiveMQ queue
     * @param store
     */
    @JmsListener(destination = "store_msg_queue")
    public void messageListener(Store store){
        log.info("Message Received. {}",store);
    }
}
