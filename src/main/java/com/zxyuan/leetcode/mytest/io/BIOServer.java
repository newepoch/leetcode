package com.zxyuan.leetcode.mytest.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZXYUAN
 * @date 2019-08-11 21:23
 */
public class BIOServer {
    public void serve(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            // 阻塞直到收到新的客户端连接
            final Socket clientSocket = serverSocket.accept();

            // 创建线程去执行客户端的请求
            new Thread(()->{
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                    while (true) {
                        writer.println(reader.readLine());
                        writer.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }

    public void serve2(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        while (true) {
            // 阻塞直到收到新的客户端连接
            final Socket clientSocket = serverSocket.accept();

            // 创建线程去执行客户端的请求
            executorService.execute(()->{
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                    while (true) {
                        writer.println(reader.readLine());
                        writer.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        }
    }
}
