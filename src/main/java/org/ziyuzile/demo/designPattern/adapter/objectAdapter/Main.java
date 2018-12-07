package org.ziyuzile.demo.designPattern.adapter.objectAdapter;

import org.ziyuzile.demo.designPattern.adapter.BB;

/**
 * 对象适配器模式
 * 原理：通过组合来实现适配器功能
 *     当我们要访问的接口A中没有我们想要的方法，却在另一个接口B中发现了合适的方法，我们又不能改变访问接口A，在这种情况下，我们可以定义一个
 * 适配器P来进行中转，这个适配器P要实现接口A，这样我们就能继续访问当前接口A中的方法，然后在适配器P中定义私有变量bInstance(对象)(B接口指向变量名)，
 * 再定义一个带参数的构造器用来为对象bInstance赋值，再在A接口的方法实现中使用对象C调用其来源于B接口的方法。
 */
public class Main {

    public static void main(String[] args) {
        P p = new P(new BB());
        p.aMethod();
    }
}
