package com.luban.ziya.sc.core;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created By ziya
 * 2020/12/18
 */
public class Teacher implements Serializable {

    private final long serialVersionUID = -732580228340865653L;

    private transient String name1;
    private String name2;

    private transient String name;
    private Integer level;

    public Teacher(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    private void readObject(ObjectInputStream objectInputStream) {
        System.out.println("readObject");

        try {
            objectInputStream.defaultReadObject();

            name = (String) objectInputStream.readObject();

            System.out.println("==>" + name);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        System.out.println("writeObject");

        try {
            objectOutputStream.defaultWriteObject();

            objectOutputStream.writeObject("nnnnnn");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
