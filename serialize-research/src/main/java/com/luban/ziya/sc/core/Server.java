package com.luban.ziya.sc.core;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created By ziya
 * 2020/10/29
 */
public class Server {

    public static void main(String[] args) {
        new Server().run();
    }

    public void run() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        ObjectInputStream inputStream = null;

        try {
            serverSocket = new ServerSocket(6688);

            System.out.println("服务器端已启动");

            while (true) {
                System.out.println("wait client connect...");

                // 1、阻塞
                socket = serverSocket.accept();

                System.out.println(socket.getRemoteSocketAddress() + "连接了");

                inputStream = new ObjectInputStream(socket.getInputStream());

                System.out.println(inputStream.readObject());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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
        }
    }
}
