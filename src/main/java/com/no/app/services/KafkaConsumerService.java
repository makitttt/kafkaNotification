package com.no.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService{
	@Autowired
	SimpMessagingTemplate template;
	
	
	@KafkaListener(topics="demoObject")
	public void consume(@Payload String message) {
		System.out.println("message from topic"+ message);
		template.convertAndSend("/topic/pushNotification", message);
	}
}
