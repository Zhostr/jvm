package com.luban.ziya.sc.serialize.impl;

import com.luban.ziya.sc.serialize.ISerialize;

/**
 * Created By ziya
 * 2020/12/19
 */
public class JsonSerialize implements ISerialize {

    @Override
    public <T> byte[] serialize(T obj) {
        return new byte[0];
    }

    @Override
    public <T> T deSerialize(byte[] data) {
        return null;
    }
}
