package com.luban.ziya.jmm;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/13
 */
public class JMMTest_1 {

    public static boolean flag = false;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("mythread-1 start");

                while (!flag) {
                    shortWait(10000000);

                }
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

                change();

                System.out.println("mythread-2 end");
            }
        }, "mythread-2").start();
    }

    public static void change() {
        flag = true;
    }

    public static void shortWait(long interval){
        long start = System.nanoTime();
        long end;
        do{
            end = System.nanoTime();
        }while(start + interval >= end);
    }
}
