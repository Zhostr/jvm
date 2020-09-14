package com.luban.ziya.thread;

/**
 * Created By ziya
 * 2020/9/9
 */
public class ThreadTest_1 implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadTest_1(), "ThreadTest_1");

        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
