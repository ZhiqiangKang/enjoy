package org.ziyuzile.demo.designPattern.observer.push;

/**
 * 抽象观察者角色类
 */
public interface Observer {

    /**
     * 更新接口
     * @param state 更新的状态
     */
    void update(String state);
}
