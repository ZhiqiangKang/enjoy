package org.ziyuzile.demo.test.staticProxy;

import org.ziyuzile.demo.test.Person;
import org.ziyuzile.demo.test.Stu;

public class StuProxy implements Person {

    private Stu stu;

    @Override
    public void eat() {
        stu.eat();
    }

    @Override
    public void buy() {
        stu.buy();
    }
}
