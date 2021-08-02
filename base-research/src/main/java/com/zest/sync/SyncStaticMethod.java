package com.zest.sync;

/**
 * Created By ziya
 * 2020/9/14
 *
 * 静态方法中的sync锁的是类对象还是实例对象
 */
public class SyncStaticMethod {

    static int val = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> run());

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(val);

        while (true);
    }

    public synchronized static void run() {
        for (int i = 0; i < 10000; i++) {
            val++;
        }
    }
}
