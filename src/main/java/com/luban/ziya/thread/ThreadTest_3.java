package com.luban.ziya.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/9/9
 */
public class ThreadTest_3 {

    public final void print(String msg) {
        System.out.println("=====");
        _print(msg);
        System.out.println("=====");
    }

    protected void _print(String msg) {

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest_3 t1 = new ThreadTest_3() {
            @Override
            protected void _print(String msg) {
                System.out.println(msg);
            }
        };
        t1.print("i am t1");

        ThreadTest_3 t2 = new ThreadTest_3() {
            @Override
            protected void _print(String msg) {
                System.out.println(msg);
            }
        };
        t2.print("i am t2");
    }
}
