package com.luban.ziya.reflect;

import java.lang.reflect.Method;

/**
 * Created By 子牙老师
 * 2021/2/20
 */
public class Test_1 {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName(Object.class.getName());

            Method[] methods = clazz.getDeclaredMethods();

            System.out.println(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
