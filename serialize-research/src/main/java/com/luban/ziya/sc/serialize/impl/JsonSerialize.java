package com.luban.ziya.sc.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.luban.ziya.sc.serialize.ISerialize;

/**
 * Created By ziya
 * 2020/12/19
 */
public class JsonSerialize implements ISerialize {


    public <T> byte[] serialize(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    public <T> T deSerialize(byte[] data) {
        return null;
    }

    public <T> T deSerialize(byte[] data, Class clazz) {
        return (T) JSON.parseObject(new String(data), clazz);
    }
}
