package com.luban.ziya.sc.core;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created By ziya
 * 2020/12/18
 */
public class Hero implements Serializable {

    private String name;
    private Integer level;

    public Hero(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
