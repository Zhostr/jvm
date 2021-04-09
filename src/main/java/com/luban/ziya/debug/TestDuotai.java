package com.luban.ziya.debug;

import java.lang.reflect.Method;

/**
 * Created By ziya
 * QQ: 3039277701
 * 2021/4/7
 */
public class TestDuotai extends Parent implements TestParent {
    public static void main(String[] args) throws Exception {
        TestParent obj = new TestDuotai();
        obj.show();
    }

    @Override
    public void show() {
        System.out.println("ziya");
    }

    public void say() {
        System.out.println("2#子牙");
    }
}

interface TestParent {
    void show();
}

class Parent {
    public void say() {
        System.out.println("1#子牙");
    }
}