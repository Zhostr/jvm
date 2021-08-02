package com.zest.debug;

/**
 * Created By ziya
 * QQ: 3039277701
 * 2021/4/7
 */
public class TestDuotai extends Parent implements TestParent {
    public static void main(String[] args) throws Exception {
        TestParent obj = new TestDuotai();
        obj.show();

        while (true);
    }

    @Override
    public void show() {
        System.out.println("com/zest");
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