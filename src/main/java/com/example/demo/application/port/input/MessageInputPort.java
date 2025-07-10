package com.example.demo.application.port.input;

import com.example.demo.domain.models.Greeting;
import com.example.demo.domain.models.HelloMessage;

public interface MessageInputPort {
    Greeting processMessage(HelloMessage message);

}
