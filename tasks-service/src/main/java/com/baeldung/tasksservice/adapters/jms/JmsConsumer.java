package com.baeldung.tasksservice.adapters.jms;

import org.springframework.stereotype.Service;
import org.springframework.jms.annotation.JmsListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class JmsConsumer {

    Logger log = LoggerFactory.getLogger(JmsConsumer.class);

    @JmsListener(destination = "deleted_user")
    public void receive(String message) {
	    log.info("Received message='{}'", message);
    }
}
