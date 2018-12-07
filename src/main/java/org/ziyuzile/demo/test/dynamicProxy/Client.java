package org.ziyuzile.demo.test.dynamicProxy;

import org.ziyuzile.demo.test.Person;
import org.ziyuzile.demo.test.Stu;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Stu stu = new Stu();
        StuInvocationHandler stuInvocationHandler = new StuInvocationHandler(stu);

        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, stuInvocationHandler);
        stuProxy.buy();
    }
}
