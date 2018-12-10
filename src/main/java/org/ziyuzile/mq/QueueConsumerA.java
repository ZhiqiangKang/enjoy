package org.ziyuzile.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumerA {

    @JmsListener(destination = "hello-queue")
    public void receive(String message){
        System.out.println(message);
    }
}
