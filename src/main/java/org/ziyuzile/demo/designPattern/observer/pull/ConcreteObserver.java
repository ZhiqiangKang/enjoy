package org.ziyuzile.demo.designPattern.observer.pull;

/**
 * 具体观察者类
 */
public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;

    @Override
    public void update(Subject subject) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = ((ConcreteSubject)subject).getState();
        System.out.println("观察者状态为："+observerState);
    }

}