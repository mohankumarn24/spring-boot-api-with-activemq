package com.javatodev.api.configuration;

import jakarta.jms.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class JmsConfiguration {

    /**
     * Set the connection with the ActiveMQ
     * @param connectionFactory
     * @return JmsListenerContainerFactory
     */
    @Bean
    public DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory(ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
        defaultJmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        // Set concurrency with minimum 5 consumers and automatically scale up to maximum of 10 consumers
        defaultJmsListenerContainerFactory.setConcurrency("5-10");
        return defaultJmsListenerContainerFactory;
    }
}
