package com.luban.ziya.socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created By ziya
 * 2020/10/29
 */
public class Server {

    Selector selector;

    public void init() {
        ServerSocketChannel serverSocketChannel = null;

        try {
            serverSocketChannel = ServerSocketChannel.open();

            serverSocketChannel.configureBlocking(false);

            serverSocketChannel.bind(new InetSocketAddress(6688));

            selector = Selector.open();

            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("NIO Server Is Running...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        this.init();

        while (true) {
            System.out.println("Wait Select Event Come...");

            try {
                int event = selector.select();

                if (event > 0) {
                    Iterator<SelectionKey> selectionKeyIterator = selector.selectedKeys().iterator();
                    while (selectionKeyIterator.hasNext()) {
                        SelectionKey selectionKey = selectionKeyIterator.next();
                        selectionKeyIterator.remove();

                        if (selectionKey.isAcceptable()) {
                            accept(selectionKey);
                        } else if (selectionKey.isReadable()){
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
            channel.read(byteBuffer);

            byteBuffer.flip();

            System.out.println("客户端说: " + new String(byteBuffer.array()));

            channel.write(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void accept(SelectionKey selectionKey) {
        ServerSocketChannel socketChannel = (ServerSocketChannel) selectionKey.channel();

        try {
            SocketChannel channel = socketChannel.accept();

            channel.configureBlocking(false);

            channel.register(selector, SelectionKey.OP_READ);

            System.out.println("接入一个客户端: " + channel.socket().getRemoteSocketAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server().run();
    }
}
