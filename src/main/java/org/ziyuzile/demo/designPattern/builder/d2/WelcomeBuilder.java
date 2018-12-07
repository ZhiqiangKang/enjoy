package org.ziyuzile.demo.designPattern.builder.d2;

/**
 * 具体建造者WelcomeBuilder
 */
public class WelcomeBuilder extends Builder{

    public WelcomeBuilder() {
        autoMessage = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        autoMessage.setSubject("欢迎标题");
    }

    @Override
    public void buildBody() {
        autoMessage.setBody("欢迎内容");
    }
}
