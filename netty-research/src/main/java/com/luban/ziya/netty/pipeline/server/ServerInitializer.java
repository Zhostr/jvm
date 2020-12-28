package com.luban.ziya.netty.pipeline.server;

import com.luban.ziya.netty.pipeline.MyLongDecoder;
import com.luban.ziya.netty.pipeline.MyLongEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

/**
 * Created By ziya
 * 2020/12/23
 */
public class ServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast(new MyLongEncoder());
        pipeline.addLast(new MyLongDecoder());

        pipeline.addLast(new ServerHandler());

        System.out.println("");
    }
}
