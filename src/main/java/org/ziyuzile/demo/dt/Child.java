package org.ziyuzile.demo.dt;

public class Child extends People {

    private People father;

    public Child(String name) {
        System.out.println(3);
        this.name = name;

        father = new People(name + ":F");
    }

    public Child() {
        System.out.println(4);
    }

    @Override
    public void doSth() {
        System.out.println("Child:doSth()");
        doStaticSth();
    }
}
