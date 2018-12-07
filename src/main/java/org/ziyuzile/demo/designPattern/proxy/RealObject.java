package org.ziyuzile.demo.designPattern.proxy;

/**
 * 目标对象角色
 */
public class RealObject extends AbstractObject {
    @Override
    void operation() {
        System.out.println("一些操作");
    }
}
