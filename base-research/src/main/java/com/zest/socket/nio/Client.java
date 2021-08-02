package com.zest.socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Created By ziya
 * 2020/10/29
 */
public class Client {

    public static final String ip = "127.0.0.1";
    public static final int port = 6688;
    Selector selector;

    public static void main(String[] args) {
        Client client = new Client();

        client.connect();
        client.listen();
    }

    public void connect() {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);

            selector = Selector.open();

            socketChannel.register(selector, SelectionKey.OP_CONNECT);

            socketChannel.connect(new InetSocketAddress(ip, port));

            System.out.println("#1 发起连接服务器...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listen() {
        while (true) {
            try {
                int event = selector.select();

                if (event > 0) {
                    Iterator<SelectionKey> selectionKeys = selector.selectedKeys().iterator();
                    while (selectionKeys.hasNext()) {
                        SelectionKey selectionKey = selectionKeys.next();
                        selectionKeys.remove();

                        if (selectionKey.isConnectable()) {
                            SocketChannel channel = (SocketChannel) selectionKey.channel();
                            if (channel.isConnectionPending()) {
                                channel.finishConnect();
                            }

                            System.out.println("#2 已连上服务器...");

                            channel.configureBlocking(false);

                            channel.register(selector, SelectionKey.OP_READ);

                            while (true) {
                                try {
                                    TimeUnit.SECONDS.sleep(1);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                channel.write(ByteBuffer.wrap("Hello, Server".getBytes()));
                            }
                        } else if (selectionKey.isReadable()) {
                            read(selectionKey);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void read(SelectionKey selectionKey) {
        SocketChannel channel = (SocketChannel) selectionKey.channel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        try {
            int len = channel.read(byteBuffer);
            if (-1 == len) {
                System.out.println("服务端已退出...");

                channel.close();
            } else {
                System.out.println("服务端返回: " + new String(byteBuffer.array()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
