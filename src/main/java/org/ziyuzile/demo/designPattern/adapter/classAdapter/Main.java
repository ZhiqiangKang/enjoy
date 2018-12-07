package org.ziyuzile.demo.designPattern.adapter.classAdapter;

import org.ziyuzile.demo.designPattern.adapter.A;

/**
 * 类适配器模式
 * 原理：通过继承来实现适配器功能
 *     当我们要访问的接口A中没有我们想要的方法，却在另一个接口B中发现了合适的方法，我们又不能改变访问接口A，在这种情况下，我们可以定义一个
 * 适配器P来进行中转，这个适配器P要实现接口A，这样我们就能继续访问当前接口A中的方法，然后再继承接口B的实现BB，这样我们就可以在适配器P中访
 * 问接口B中的方法了，这时我们在适配器P中的接口A方法中直接引用BB中的合适的方法，这样就完成了一个简单的类适配器。
 */
public class Main {
    public static void main(String[] args) {
        A a = new P();
        a.aMethod();
    }
}
