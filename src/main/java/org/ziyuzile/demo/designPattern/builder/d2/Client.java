package org.ziyuzile.demo.designPattern.builder.d2;

public class Client {

    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("from@163.com", "to@163.com");
    }

}
