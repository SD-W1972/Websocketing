package com.example.demo.controllers;

import com.example.demo.domain.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.example.demo.domain.models.Greeting;
import com.example.demo.domain.models.HelloMessage;

@Controller
public class MessageController {

	@Autowired
	GreetingService greetingService;
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception{
		return null; //gotta fix this later
	}
}
