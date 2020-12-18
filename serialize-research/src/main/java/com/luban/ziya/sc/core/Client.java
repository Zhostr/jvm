package com.luban.ziya.sc.core;

import java.io.*;
import java.net.Socket;

/**
 * Created By ziya
 * 2020/10/29
 */
public class Client {

    String ip;
    int port;

    public static void main(String[] args) {
        new Client("127.0.0.1", 6688).run();
    }

    public Client(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void run() {
        Socket socket = null;
        ObjectOutputStream outputStream = null;
        Object object = new Teacher("ziya", 99);

        try {
            socket = new Socket(ip, port);

            outputStream = new ObjectOutputStream(socket.getOutputStream());

            System.out.println("write to server: " + object);

            outputStream.writeObject(object);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != outputStream) {
                try {
                    outputStream.close();
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
        }
    }
}
