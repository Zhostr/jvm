package com.zest.socket.netty.chat.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.Scanner;

public class ChatClient {

    private String ip;
    private int port;

    public static void main(String[] args) {
        new ChatClient("127.0.0.1", 6688).run();
    }

    public ChatClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void run() {
        NioEventLoopGroup loopGroup = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();

            bootstrap.group(loopGroup);
            bootstrap.channel(NioSocketChannel.class);
            bootstrap.handler(new ChatClientInitializer());

            ChannelFuture channelFuture = bootstrap.connect(ip, port).sync();

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                channelFuture.channel().writeAndFlush(scanner.nextLine() + "\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            loopGroup.shutdownGracefully();
        }
    }
}
