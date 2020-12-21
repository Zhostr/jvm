package com.luban.ziya.sc.serialize.impl;

import com.luban.ziya.sc.serialize.ISerialize;

/**
 * Created By ziya
 * 2020/12/19
 */
public class Hisson2Serialize implements ISerialize {


    public <T> byte[] serialize(T obj) {
        return new byte[0];
    }

    public <T> T deSerialize(byte[] data) {
        return null;
    }

    public <T> T deSerialize(byte[] data, Class clazz) {
        return null;
    }
}
