package com.luban.ziya.oop;

import java.lang.reflect.Field;

/**
 * Created By ziya
 * QQ: 3039277701
 * 2021/4/2
 */
class Parentt {
    private int v1 = 100;
    private int v2 = 200;
}

public class Test_1 extends Parentt {

    private static int v1 = 10;

    public static void main(String[] args) throws Exception {
        Test_1 obj = new Test_1();

        Class clazz = obj.getClass();
        Field field = clazz.getDeclaredField("v1");
        System.out.println(field.get(obj));
    }


}
