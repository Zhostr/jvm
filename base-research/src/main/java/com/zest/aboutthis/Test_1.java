package com.zest.aboutthis;

/**
 * Created By ziya
 * 2020/8/19
 */
public class Test_1 {

    public int age;

    public static void main(String[] args) {
        Test_1 obj = null;

        obj.say();
        obj.getAge();
    }

    public void say() {
        System.out.println("hello");
    }

    public void getAge() {
        System.out.println(this.age);
    }
}
