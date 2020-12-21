package com.luban.ziya.sc;

import com.luban.ziya.sc.core.Hero;
import com.luban.ziya.sc.serialize.ISerialize;
import com.luban.ziya.sc.serialize.impl.ProtobufSerialize;
import com.luban.ziya.sc.serialize.impl.ProtobufSerialize_1;

/**
 * Created By ziya
 * 2020/12/19
 */
public class ProtobufSerializeTest_1 {

    public static void main(String[] args) {
        Hero hero = new Hero("ziya", 99);

        ISerialize serialize = new ProtobufSerialize_1(Hero.class);

        byte[] bytes = serialize.serialize(hero);

        System.out.println("=====");

        for (int i = 0; i < bytes.length; i++) {
            System.out.print(Integer.toHexString(bytes[i]) + " ");
        }

        System.out.println("");

        System.out.println("=>" + bytes.length);
        System.out.println("=====");

//        Hero obj = serialize.deSerialize(null);
//        System.out.println(obj);
    }
}
