package com.luban.ziya.netty.heartbeat;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * Created By ziya
 * 2020/12/21
 */
public class ServerHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println(msg);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();

        System.out.println("有客户端连接: " + channel.remoteAddress());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();

        System.out.println("有客户端退出: " + channel.remoteAddress());
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            String state = "";

            switch (event.state()) {
                case WRITER_IDLE:
                    state = "write idle";
                    break;
                case READER_IDLE:
                    state = "read idle";
                    break;
                case ALL_IDLE:
                    state = "all idle";
                    break;
            }

            System.out.println(ctx.channel().remoteAddress() + "->" + state);
        }
    }
}
