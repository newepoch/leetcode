package com.zxyuan.leetcode.socket;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ZXYUAN
 * @date 2019-08-02 20:25
 */
public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(65000);
        System.out.println("TCPserver启动");
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("监听中");
            new LengthCalculator(socket).start();
        }
    }

}
