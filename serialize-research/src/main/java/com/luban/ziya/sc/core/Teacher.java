package com.luban.ziya.sc.core;

import java.io.Serializable;

/**
 * Created By ziya
 * 2020/12/18
 */
public class Teacher implements Serializable {

    private String name;
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
}
