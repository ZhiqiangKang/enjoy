package org.ziyuzile.demo.designPattern.singleton.innerClass;

/**
 * 内部类(推荐用)
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 * 同：两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同：在饿汉式方式是只要Singleton类被装载就会实例化，内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类。
 * 优点：避免了线程不安全，延迟加载，效率高。
 */
public class SingletonInnerClass {

    /**
     * 私有化构造
     */
    private SingletonInnerClass() {}

    private static class SingletonInnerClassHolder {
        private static SingletonInnerClass singletonInnerClass = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return SingletonInnerClassHolder.singletonInnerClass;
    }
}