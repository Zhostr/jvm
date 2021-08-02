package com.zest.classloader;

public class Classloader_4 extends ClassLoader {

    public static void main(String[] args) throws ClassNotFoundException {
        Classloader_4 classloader = new Classloader_4();
        Class<?> clazz = classloader.loadClass(String.class.getName());

        System.out.println(clazz.getClassLoader().getParent());
    }
}