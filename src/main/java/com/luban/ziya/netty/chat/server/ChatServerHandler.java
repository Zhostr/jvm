package com.luban.ziya.netty.chat.server;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

public class ChatServerHandler extends SimpleChannelInboundHandler<String> {

    public static ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        Channel channel = ctx.channel();

        channels.forEach(ch -> {
            if (channel == ch) {
                ch.writeAndFlush("[自己]发送了消息: " + msg + "\n");
            } else {
                ch.writeAndFlush("[客户端: " + channel.remoteAddress() + "]发送了消息: " + msg + "\n");
            }
        });
    }

    /**
     * 一旦连接建立，第一个运行
     * @param ctx
     * @throws Exception
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        channels.add(ctx.channel());

        channels.writeAndFlush("客户端 " + ctx.channel().remoteAddress() + " 加入聊天\n");
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        channels.writeAndFlush("客户端 " + ctx.channel().remoteAddress() + " 离开了\n");
    }

    /**
     * channel处于活动状态
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端 " + ctx.channel().remoteAddress() + " 上线了");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端 " + ctx.channel().remoteAddress() + " 离线了");
    }
}
