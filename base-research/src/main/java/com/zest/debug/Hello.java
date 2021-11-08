package com.zest.debug;

import com.zest.utils.SystemMethod;

/**
 * Created By ziya
 * QQ: 3039277701
 * 2021/4/8
 */
public class Hello {

    private int normalVar = 1000;

    private static int STATIC_VAR_INIT = 10;

    private static int STATIC_VAR_NO_INIT;

    private static final int STATIC_FINAL_VAR = 100;

    public static void main(String[] args) throws Exception {
        Hello helloObj = new Hello();

        int[] intArray = new int[10];
        Hello[] objArray = new Hello[2];
        System.out.println("processId = " + SystemMethod.getProcessId());
//        int a = 10;
//
//        try {
//            Class.forName(Hello.class.getName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        Thread thread = new Thread();

    }
}