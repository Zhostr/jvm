package com.luban.ziya.thread;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/9
 */
public class ThreadTest_2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    System.out.println(i);
                }
            }
        };

        thread.start();

        TimeUnit.SECONDS.sleep(2);

        thread.start();
    }
}
