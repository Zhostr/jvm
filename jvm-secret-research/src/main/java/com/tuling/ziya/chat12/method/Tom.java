package com.tuling.ziya.chat12.method;

/**
 * Created By 子牙老师
 * 2021/1/24
 */
public class Tom extends Cat {

    @Override
    public String name() {
        return "Tom";
    }

    @Override
    public void life() {
        System.out.println("life");
    }

    @Override
    public void earth() {
        System.out.println("earth");
    }
}
