package com.luban.ziya.debug;

/**
 * Created By ziya
 * QQ: 3039277701
 * 2021/4/8
 */
public class Hello {

    public static void main(String[] args) throws Exception {
        int a = 10;

        try {
            Class.forName(Hello.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread();

        while (true);
    }
}