package org.ziyuzile.demo.designPattern.builder.d2;

/**
 * GoodbyeBuilder
 */
public class GoodbyeBuilder extends Builder{

    public GoodbyeBuilder() {
        autoMessage = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        autoMessage.setSubject("欢送标题");
    }

    @Override
    public void buildBody() {
        autoMessage.setBody("欢送内容");
    }
}
