package com.example.demo.infrastructure.adapter.websocket;

import com.example.demo.application.port.input.MessageInputPort;
import com.example.demo.domain.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.demo.domain.models.Greeting;
import com.example.demo.domain.models.HelloMessage;

@Controller
public class MessageController {

	private final MessageInputPort messageInputPort;

	public MessageController(MessageInputPort messageInputPort) {
		this.messageInputPort = messageInputPort;
	}

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception{
		Thread.sleep(1000);

		return messageInputPort.processMessage(message);
	}
}
