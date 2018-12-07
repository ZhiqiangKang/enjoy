package org.ziyuzile.demo.designPattern.builder.d2;

import java.util.Date;

/**
 * 抽象建造者类
 */
public abstract class Builder {

    protected AutoMessage autoMessage;

    /**
     * 标题零件的建造方法
     */
    public abstract void buildSubject();

    /**
     * 内容零件的建造方法
     */
    public abstract void buildBody();

    /**
     * 发件人零件的建造方法
     * @param from
     */
    public void buildFrom(String from){
        autoMessage.setFrom(from);
    }

    /**
     * 收件人零件的建造方法
     * @param to
     */
    public void buildTo(String to){
        autoMessage.setTo(to);
    }

    /**
     * 发送时间零件的建造方法
     */
    public void buildSendDate(){
        autoMessage.setSendDate(new Date());
    }

    /**
     * 邮件产品完成后，用此方法发送邮件
     * 此方法相当于产品返还方法
     */
    public void sendMessage(){
        autoMessage.send();
    }
}
