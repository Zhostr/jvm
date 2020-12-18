package com.luban.ziya.netty.composite;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;

/**
 * Created By ziya
 * 2020/11/23
 */
public class Example_2 {

    public static void main(String[] args) {
        ByteBuf buffer1 = Unpooled.buffer();

        buffer1.writeByte(11);

        //=====

        ByteBuf buffer2 = Unpooled.buffer(20);

        buffer2.writeBytes("hello".getBytes());

        //=====
        CompositeByteBuf compositeBuffer = Unpooled.compositeBuffer();

        compositeBuffer.addComponent(true, buffer1);
        compositeBuffer.addComponent(true, buffer2);

        System.out.println(compositeBuffer.getByte(1));

        System.out.println("end");
    }
}
