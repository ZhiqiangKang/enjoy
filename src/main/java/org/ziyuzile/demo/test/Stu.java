package org.ziyuzile.demo.test;

public class Stu implements Person {

    @Override
    public void eat() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("吃饭");
    }

    @Override
    public void buy() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("购物");
    }
}
