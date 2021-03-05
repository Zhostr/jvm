//package com.luban.ziya.sync;
//
//import org.openjdk.jol.info.ClassLayout;
//import sun.misc.Unsafe;
//
//import java.lang.reflect.Field;
//
///**
// * Created By ziya
// * 2020/10/22
// */
//public class UnsafeSync {
//
//    public static void main (String[] args) throws Exception {
//        Object obj = new Object();
//
//        Field field = Unsafe.class.getDeclaredField("theUnsafe");
//        field.setAccessible(true);
//        Unsafe unsafe = (Unsafe) field.get(null);
//
////        unsafe.monitorEnter(obj);
//
//        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
//
////        unsafe.monitorExit(obj);
//    }
//}
