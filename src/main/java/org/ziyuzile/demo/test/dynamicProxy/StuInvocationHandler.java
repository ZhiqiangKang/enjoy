package org.ziyuzile.demo.test.dynamicProxy;

import org.ziyuzile.demo.test.MonitorUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuInvocationHandler implements InvocationHandler {

    private Object target;

    public StuInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        MonitorUtil.start();

        Object result = method.invoke(target, args);

        MonitorUtil.finish(method.getName());

        return result;
    }
}
