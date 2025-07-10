package com.example.demo.domain.service;

import com.example.demo.domain.models.Greeting;
import com.example.demo.domain.models.HelloMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

@Service
public class GreetingService {

    public Greeting createGreeting(HelloMessage message) {
        //extracting the business logic from the controller to a brand-new service class
        String sanitizedName = HtmlUtils.htmlEscape(message.getName());
        return new Greeting("Hello " + sanitizedName + "!");
    }

}
