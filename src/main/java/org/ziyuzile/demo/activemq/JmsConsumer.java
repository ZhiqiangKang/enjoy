package org.ziyuzile.demo.activemq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class JmsConsumer {

    private static final String USER = ActiveMQConnection.DEFAULT_USER;
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    private static final String BROKER_URL = ActiveMQConnection.DEFAULT_BROKER_URL;

    public static void main(String[] args) {
        // 连接工厂
        ConnectionFactory connectionFactory;
        // 连接
        Connection connection = null;
        // 会话
        Session session;
        // 消息目的地
        Destination destination;
        // 消息消费者
        MessageConsumer messageConsumer;

        // 实例化连接工厂
        connectionFactory = new ActiveMQConnectionFactory(USER, PASSWORD, BROKER_URL);

        try {
            // 通过连接工厂创建连接
            connection = connectionFactory.createConnection();
            // 启动连接
            connection.start();
            // 创建会话(是否开启事务，是否自动确认)
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            // 创建一个名为HelloWorld的消息队列
            destination = session.createTopic("HelloWorld");
            // 创建消息消费者
            messageConsumer = session.createConsumer(destination);
            Message message;
            while ((message = messageConsumer.receive()) != null){
                String text = ((TextMessage) message).getText();
                System.out.println(text);
            }
        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
