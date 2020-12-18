package com.luban.ziya.socket.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        OutputStream outputStream = null;
        InputStream inputStream = null;

        try {
            socket = new Socket(ip, port);

            outputStream = socket.getOutputStream();
            inputStream = socket.getInputStream();

            outputStream.write("123abc".getBytes("utf-8"));

            //=====
            byte[] content = new byte[1024];
            inputStream.read(content);
            System.out.println("服务器端返回: " + new String(content));
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
