package org.ziyuzile.demo.thread;

public class MyThreadLocal {

    private static final ThreadLocal<Context> threadLocal = new ThreadLocal<Context>();

    public static void set(Context context) {
        threadLocal.set(context);
    }

    public static void remove() {
        threadLocal.remove();
    }

    public static Context get() {
        return threadLocal.get();
    }
}
