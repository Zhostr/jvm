//package com.luban.ziya.sync.lock;
//
//import sun.misc.Unsafe;
//
//import java.lang.reflect.Field;
//
///**
// * Created By ziya
// * 2020/10/23
// */
//public class Test_4 {
//
//    static int tickets = 0;
//
//    static Unsafe unsafe;
//
//    static {
//        Field field = null;
//        try {
//            field = Unsafe.class.getDeclaredField("theUnsafe");
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//
//        field.setAccessible(true);
//
//        try {
//            unsafe = (Unsafe) field.get(null);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        Thread t1 = new Thread(()->getTicket());
//        Thread t2 = new Thread(()->getTicket());
//        Thread t3 = new Thread(()->getTicket());
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("===== " + tickets + " =====");
//    }
//
//    public static void getTicket() {
////        unsafe.monitorEnter(Test_4.class);
//
//        for (int i = 0; i < 10000; i++) {
//            tickets++;
//        }
//
////        unsafe.monitorExit(Test_4.class);
//
//    }
//}
