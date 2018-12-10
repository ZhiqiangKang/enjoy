package org.ziyuzile.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class QueueProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void send(String destination, String message){
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}
