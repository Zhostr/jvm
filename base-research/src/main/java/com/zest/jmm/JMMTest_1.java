package com.zest.jmm;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/13
 */
public class JMMTest_1 {

    public volatile boolean flag = false;

    public static void main(String[] args) {
        JMMTest_1 obj = new JMMTest_1();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("mythread-1 start");

                while (!obj.flag) {

                }

                System.out.println("mythread-1 end");
            }
        }, "mythread-1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("mythread-2 start");

                obj.change();

                System.out.println("mythread-2 end");
            }
        }, "mythread-2").start();
    }

    public void change() {
        flag = true;
    }
}
