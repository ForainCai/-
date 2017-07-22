package com.zking.util;

import javax.jms.Destination;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;

import com.google.gson.JsonObject;
public class MessageSender {
	private  Logger logger = LoggerFactory.getLogger(this.getClass());
	private final JmsTemplate jmsTemplate;
    private final Destination destination;

    public MessageSender(final JmsTemplate jmsTemplate, final Destination destination) {
        this.jmsTemplate = jmsTemplate;
        this.destination = destination;
    }

    public boolean send(final String text) {
    	boolean flag = false;
        try {
            jmsTemplate.setDefaultDestination(destination);
            jmsTemplate.convertAndSend(text);
            logger.info("发送消息 : " + text);
            flag = true;
        } catch (Exception e) {
            logger.debug(e.getMessage());
        }
        return flag;
    }
}
