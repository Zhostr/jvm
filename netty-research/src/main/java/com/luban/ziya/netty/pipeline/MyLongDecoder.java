package com.luban.ziya.netty.pipeline;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * Created By ziya
 * 2020/12/23
 */
public class MyLongDecoder extends ByteToMessageDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        System.out.println("MyLongDecoder decode->" + in.readableBytes());

        if (in.readableBytes() >= 8) {
            System.out.println("=>here");

            out.add(in.readLong());
        }
    }
}
