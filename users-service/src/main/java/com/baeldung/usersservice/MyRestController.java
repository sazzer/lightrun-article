package com.baeldung.usersservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyRestController {

    @Autowired
    JmsProducer jmsProducer;

    @PostMapping("/send")
    public void sendDataToJms(@RequestParam String message) {
	jmsProducer.send(message);
    }
}
