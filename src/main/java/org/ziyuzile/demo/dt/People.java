package org.ziyuzile.demo.dt;

public class People {

    String name;

    private static int age;

    public People() {
        System.out.println(1);
    }

    public People(String name) {
        System.out.println(2);
        this.name = name;
    }

    static {
        age = 10;
    }

    public void service(){
        doSth();
    }

    public static void doStaticSth(){
        System.out.println("People:doStaticSth(), age =" + age);
    }

    public void doSth(){
        System.out.println("People:doSth()");
    }
}
