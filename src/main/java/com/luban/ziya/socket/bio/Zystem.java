package com.luban.ziya.socket.bio;

import java.net.ServerSocket;

/**
 * Created By ziya
 * 2020/12/27
 */
public class Zystem {

    public static native Object configureBlocking(ServerSocket serverSocket, boolean isBlock);

}
