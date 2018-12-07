package org.ziyuzile.demo.thread;

public class BusinessService {

    public void businessMethod() {
        Context context = MyThreadLocal.get();
        System.out.println("service[" + Thread.currentThread().getName() + "]:" + context.getTransactionId());
    }
}
