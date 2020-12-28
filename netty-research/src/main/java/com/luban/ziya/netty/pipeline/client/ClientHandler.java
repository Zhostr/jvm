package com.luban.ziya.netty.pipeline.client;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

/**
 * Created By ziya
 * 2020/12/23
 */
public class ClientHandler extends SimpleChannelInboundHandler<Long> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Long msg) throws Exception {
        System.out.println("server say: " + msg);

        ctx.channel().close();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("client write to server");

        ctx.channel().writeAndFlush(12345678l);
//        ctx.channel().writeAndFlush(Unpooled.wrappedBuffer("1234123412341234".getBytes()));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("server caught exception");

        ctx.channel().close();
    }
}
