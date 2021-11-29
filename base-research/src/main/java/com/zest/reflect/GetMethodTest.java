package com.zest.reflect;

import java.lang.reflect.Method;

/**
 * @author Zest
 * @version 1.0
 * @date 2021/11/18 19:59:19
 */
public class GetMethodTest {

    /**
     * 使用反射得到的 Method.class 对象，每次都是 new 出来的
     * @param args
     * @throws NoSuchMethodException
     */
    public static void main(String[] args) throws NoSuchMethodException {
        Person tony = new Person("Tony", 19);
        Method getName = tony.getClass().getMethod("getName", null);
        Method getName2 = tony.getClass().getMethod("getName", null);
        System.out.println(getName2 == getName);
    }




    private static class Person {
        private String name;

        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
    }

}
