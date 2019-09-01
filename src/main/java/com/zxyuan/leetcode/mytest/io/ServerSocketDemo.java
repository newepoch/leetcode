package com.zxyuan.leetcode.mytest.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.SocketHandler;

/**
 * @author ZXYUAN
 * @date 2019-08-13 19:08
 */
public class ServerSocketDemo {

    public static void main(String[] args) throws IOException {
        new ServerSocketDemo().start(8080);
    }
    private  void start(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port,2000);
        System.out.println("server is start!");
        //线程池可以处理多个连接比较消耗性能
        ExecutorService executorService= Executors.newCachedThreadPool();
        try {
            while (true) {
                //accept 会阻塞
                Socket socket = serverSocket.accept();
                System.out.println("有客户端连接来了"+socket.toString());
                //executorService.execute(new SocketHandler(socket));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            serverSocket.close();
        }
    }
}
