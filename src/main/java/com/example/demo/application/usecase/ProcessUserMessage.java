package com.example.demo.application.usecase;

import com.example.demo.application.port.input.MessageInputPort;
import com.example.demo.domain.models.Greeting;
import com.example.demo.domain.models.HelloMessage;
import com.example.demo.domain.service.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class ProcessUserMessage implements MessageInputPort {
    private final GreetingService greetingService;

    public ProcessUserMessage(GreetingService greetingService){
        this.greetingService = greetingService;

    }

    @Override
    public Greeting processMessage(HelloMessage message){
        return greetingService.createGreeting(message);
    }
}
