package org.ziyuzile.demo.designPattern.adapter.interfaceAdapter;

/**
 * 接口适配器模式
 * 原理：通过抽象类来实现适配，这种适配稍别于类适配和对象适配
 *     当存在这样一个接口，其中定义了N多的方法，而我们现在却只想使用其中的一个或几个方法，如果我们直接实现接口，那么我们要对所有的方法进行
 * 实现，哪怕我们仅仅是对不需要的方法进行置空(只写一对大括号，不做具体方法实现)，也会导致这个类变得臃肿，调用也不方便，这时我们可以使用一个
 * 抽象类作为中间件，即适配器，用这个抽象类实现接口，而在抽象类中所有的方法都进行置空，那么我们在创建抽象类的继承类，重写我们需要使用的那几
 * 个方法即可。
 */
public class Main {
    public static void main(String[] args) {
        TargerInterface targerInterface = new TargerImplement();
        targerInterface.a();
        targerInterface.b();
    }
}
