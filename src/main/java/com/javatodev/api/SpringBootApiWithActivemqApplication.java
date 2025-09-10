package com.javatodev.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApiWithActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiWithActivemqApplication.class, args);
	}
}

/*
 * ActiveMQ setup:
 * Download ActiveMQ: https://activemq.apache.org/components/classic/download/
 * Extract downloaded zip file and navigate to "apache-activemq-6.1.7-bin\apache-activemq-6.1.7\bin" folder
 * Execute "activemq.bat" to start ActiveMQ
 * Access ActiveMQ in browser: http://127.0.0.1:8161/
 * Default username: admin
 * Default password: admin
 *
 * Application:
 * Reference: https://www.javatodev.com/how-to-use-activemq-with-spring-boot-rest-api/
 *
 * Send POST request:
 * POST: http://localhost:8080/api/v1/publish
 * {
 *     "itemId":"1",
 *     "itemName":"PA",
 *     "itemQuantity":"10"
 * }
 *
 * Output:
 * Consumer: Store(itemId=1, itemName=PA, itemQuantity=10)
 * Producer: Message Sent
 *
 */