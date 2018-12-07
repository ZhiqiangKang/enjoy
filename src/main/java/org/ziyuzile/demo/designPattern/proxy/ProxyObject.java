package org.ziyuzile.demo.designPattern.proxy;

/**
 * 代理对象角色
 */
public class ProxyObject extends AbstractObject{

    RealObject realObject = new RealObject();

    @Override
    void operation() {
        // 调用目标对象之前可以做相关操作
        System.out.println("before");
        realObject.operation();
        // 调用目标对象之后可以做相关操作
        System.out.println("after");
    }
}
