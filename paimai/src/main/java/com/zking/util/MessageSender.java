package com.zking.util;

import javax.jms.Destination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
public class MessageSender {
	private  Logger logger = LoggerFactory.getLogger(this.getClass());
	private final JmsTemplate jmsTemplate;
    private final Destination destination;

    public MessageSender(final JmsTemplate jmsTemplate, final Destination destination) {
        this.jmsTemplate = jmsTemplate;
        this.destination = destination;
    }

    public void send(final String text) {
        try {
        	
            jmsTemplate.setDefaultDestination(destination);
            jmsTemplate.convertAndSend(text);
            logger.info("发送消息 : " + text);
        } catch (Exception e) {
            logger.debug(e.getMessage());
        }
    }
}
