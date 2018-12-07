package org.ziyuzile.demo.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalDemo implements Runnable {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        Context context = new Context();
        context.setTransactionId(getName());
        MyThreadLocal.set(context);
        System.out.println("request[" + Thread.currentThread().getName() + "]:" + context.getTransactionId());
        new BusinessService().businessMethod();
        MyThreadLocal.remove();
    }

    private String getName() {
        return atomicInteger.getAndIncrement() + "";
    }

    public static void main(String[] args) {
        ThreadLocalDemo tld = new ThreadLocalDemo();
        new Thread(tld).start();
        new Thread(tld).start();
    }
}
