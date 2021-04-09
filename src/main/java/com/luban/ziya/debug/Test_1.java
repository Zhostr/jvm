package com.luban.ziya.debug;

import java.lang.reflect.Field;

/**
 * Created By ziya
 * 2020/12/30
 */
public class Test_1 {

    private int a = 10;

    public static void main(String[] args) {
        Test_1 obj = new Test_1();

        Class clazz = obj.getClass();
        try {
            Field field = clazz.getDeclaredField("a");

            field.set(obj, 20);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(obj.a);
    }
}