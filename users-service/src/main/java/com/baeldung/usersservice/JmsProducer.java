package com.baeldung.usersservice;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class JmsProducer {

  Logger log = LoggerFactory.getLogger(JmsProducer.class);

  @Autowired
  private JmsTemplate jmsTemplate;

  public void send(String message) {
    jmsTemplate.convertAndSend(message);
    log.info("Sent message='{}'", message);
  }
}
