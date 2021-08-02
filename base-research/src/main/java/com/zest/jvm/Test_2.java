package com.zest.jvm;

/**
 * Created By 子牙老师
 * 2021/2/22
 */
public class Test_2 {

    public static void main(String[] args) {
        try {
            Class<?> clazz1 = Class.forName(Test_2.class.getName());

            clazz1.getAnnotations();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
