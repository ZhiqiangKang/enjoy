package org.ziyuzile.conf;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.ConnectionFactory;

@Configuration
@EnableJms
public class ActiveMQConfiguration {

    @Value("${spring.activemq.broker-url}")
    private String brokerURL;

    @Value("${spring.activemq.user}")
    private String userName;

    @Value("${spring.activemq.password}")
    private String password;

    public ConnectionFactory getConnectionFactory(){
        ActiveMQConnectionFactory connectionFactory
                = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL(brokerURL);
        connectionFactory.setUserName(userName);
        connectionFactory.setPassword(password);

        return connectionFactory;
    }
}
