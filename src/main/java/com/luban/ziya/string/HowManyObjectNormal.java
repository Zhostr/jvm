package com.luban.ziya.string;

/**
 * Created By 子牙老师
 * 2021/3/3
 *
 * 测试创建了几个对象
 */
public class HowManyObjectNormal {

    public static void main(String[] args) {
        t4();
    }

    public static void t1() {
        String s = "11zi";
    }

    public static void t2() {
        String s1 = "11";
        String s2 = "11";
    }

    public static void t3() {
        String s = new String("11ziya");
    }

    public static void t4() {
        String s1 = new String("11");
        String s2 = new String("11");
    }
}