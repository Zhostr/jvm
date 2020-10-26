package com.luban.ziya.thread;

import sun.misc.Unsafe;

import java.util.concurrent.locks.LockSupport;

/**
 * Created By ziya
 * 2020/9/9
 */
public class ThreadTest_4 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");

        LockSupport.park();

        System.out.println("end");
    }
}
