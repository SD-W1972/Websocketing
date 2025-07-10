package com.example.demo.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.example.demo.models.Greeting;
import com.example.demo.models.HelloMessage;

@Controller
public class MessageController {

	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception{
		Thread.sleep(1000);
		
		return new Greeting("Hello " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}
}
