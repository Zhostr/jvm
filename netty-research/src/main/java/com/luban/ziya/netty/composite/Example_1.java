package com.luban.ziya.netty.composite;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * Created By ziya
 * 2020/11/23
 */
public class Example_1 {

    public static void main(String[] args) {
        ByteBuf buffer1 = Unpooled.buffer();

        buffer1.writeByte(0x11);

        //=====

        ByteBuf buffer2 = Unpooled.buffer(20);

        buffer2.writeByte(0xab);

        //=====

        System.out.println(buffer1.readableBytes());

        ByteBuf buffer = Unpooled.buffer(buffer1.readableBytes() + buffer2.readableBytes());

        System.out.println("end");
    }
}
