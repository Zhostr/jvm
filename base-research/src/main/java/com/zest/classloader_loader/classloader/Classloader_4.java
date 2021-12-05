package com.zest.classloader_loader.classloader;

public class Classloader_4 extends ClassLoader {

    public static void main(String[] args) throws ClassNotFoundException {
        Classloader_4 classloader = new Classloader_4();
        // 自定义类加载器的 parent 都是 Application ClassLoader
        System.out.println(classloader.getParent() == ClassLoader.getSystemClassLoader());
        // 加载类的时候，会先让 parent 去加载，即交给 AppClassLoader 然后 AppClassLoader 再交给 ExtClassLoader，最终再交给 BootstrapClassLoader
        // BootstrapClassLoader 一看 String 是 rt.jar 包下面的类，然后就自己加载了
        String stringClassName = String.class.getName();
        System.out.println("stringClassName = " + stringClassName);
        Class<?> clazz = classloader.loadClass(stringClassName);
        System.out.println(clazz.getClassLoader().getParent());
    }

}