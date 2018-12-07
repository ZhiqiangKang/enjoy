package org.ziyuzile.demo.designPattern.singleton.lanHan;

/**
 * 单例模式的懒汉式
 */
public class SingletonLanHan {

    /**
     * 私有化构造
     */
    private SingletonLanHan() {}

    /**
     * 单例模式的懒汉式(线程不安全，不可用)
     */
    private static SingletonLanHan singletonLanHan;

    public static SingletonLanHan getInstance() {
        if (singletonLanHan == null) { // 这里线程是不安全的,可能得到两个不同的实例
            singletonLanHan = new SingletonLanHan();
        }
        return singletonLanHan;
    }

    /**
     * 单例模式的懒汉式(线程安全，效率低不推荐使用)
     * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面
     * 的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
     */
    private static SingletonLanHan singletonLanHanTwo;

    public static synchronized SingletonLanHan getInstanceTwo() {
        if (singletonLanHanTwo == null) {
            singletonLanHanTwo = new SingletonLanHan();
        }
        return singletonLanHanTwo;
    }

    /**
     * 单例模式的懒汉式(线程不安全，不可用)
     * 虽然加了锁，但是等到第一个线程执行完instance=new Singleton()跳出这个锁时，另一个进入if语句的线程同样会实例化另外一个Singleton对象，线程不安全。
     */
    private static SingletonLanHan singletonLanHanThree = null;

    public static SingletonLanHan getInstanceThree() {
        if (singletonLanHanThree == null) {
            synchronized (SingletonLanHan.class) {// 线程不安全
                singletonLanHanThree = new SingletonLanHan();
            }
        }
        return singletonLanHanThree;
    }

    /**
     * 单例模式懒汉式双重校验锁(推荐用)
     * 懒汉式变种,属于懒汉式的最好写法,保证了:延迟加载和线程安全
     */
    private static SingletonLanHan singletonLanHanFour;

    public static SingletonLanHan getInstanceFour() {
        if (singletonLanHanFour == null) {
            synchronized (SingletonLanHan.class) {
                if (singletonLanHanFour == null) {
                    singletonLanHanFour = new SingletonLanHan();
                }
            }
        }
        return singletonLanHanFour;
    }
}
