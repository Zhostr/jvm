package com.luban.ziya.sc.serialize.impl;

import com.luban.ziya.sc.serialize.ISerialize;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.runtime.RuntimeSchema;

/**
 * Created By ziya
 * 2020/12/19
 */
public class ProtobufSerialize implements ISerialize {

    private RuntimeSchema schema;

    public ProtobufSerialize(Class clazz) {
        schema = RuntimeSchema.createFrom(clazz);
    }

    public <T> byte[] serialize(T obj) {
        return ProtostuffIOUtil.toByteArray(obj, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
    }

    public <T> T deSerialize(byte[] data) {
        T o = (T) schema.newMessage();

        ProtostuffIOUtil.mergeFrom(data, o, schema);

        return o;
    }

    public <T> T deSerialize(byte[] data, Class clazz) {
        return null;
    }
}
