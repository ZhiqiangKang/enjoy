package org.ziyuzile.demo.designPattern.builder.d2;

public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各零件的建造方法
     * @param from
     * @param to
     */
    public void construct(String from, String to){
        builder.buildFrom(from);
        builder.buildTo(to);
        builder.buildSubject();
        builder.buildBody();
        builder.buildSendDate();
        builder.sendMessage();
    }
}
