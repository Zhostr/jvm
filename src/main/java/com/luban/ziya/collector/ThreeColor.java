package com.luban.ziya.collector;

/**
 * Created By 子牙老师
 * 2021/3/14
 */
public class ThreeColor {


    public static void main(String[] args) {
        ThreeColor_1 obj1 = new ThreeColor_1();

        ThreeColor_3 obj4 = new ThreeColor_3();
    }

    public static Object create() {
        return new ThreeColor_3();
    }
}

class ThreeColor_1 {
    public Object obj2 = new ThreeColor_2();
}

class ThreeColor_2 {
    public Object obj3 = new String("ziya");
}

class ThreeColor_3 {
    public Object obj5 = new String("ziya");
}
