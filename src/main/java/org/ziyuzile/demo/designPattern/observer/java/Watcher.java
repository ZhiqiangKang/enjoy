package org.ziyuzile.demo.designPattern.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Watcher implements Observer{
    public Watcher(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object object) {

        System.out.println("状态发生改变：" + ((Watched)observable).getData());
    }
}
