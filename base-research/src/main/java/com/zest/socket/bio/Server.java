package com.zest.socket.bio;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created By ziya
 * 2020/10/29
 */
public class Server {

    public static void main(String[] args) {
        System.loadLibrary("jni");

        new Server().run();
    }

    public void run() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            serverSocket = new ServerSocket(6688);

            FileDescriptor o = (FileDescriptor) Zystem.configureBlocking(serverSocket, false);
            System.out.println(o);

            System.out.println("服务器端已启动");

            while (true) {
                System.out.println("wait client connect...");

                // 1、阻塞
                socket = serverSocket.accept();

                System.out.println(socket.getRemoteSocketAddress() + "连接了");

                inputStream = socket.getInputStream();

                int len = 0;
                byte[] content = new byte[1024];

                System.out.println("wait client write...");

                // 2、阻塞
                inputStream.read(content);

                System.out.println("客户端说: " + new String(content) + "# 写回去");

                //=====
                outputStream = socket.getOutputStream();

                outputStream.write(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != serverSocket) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != socket) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
