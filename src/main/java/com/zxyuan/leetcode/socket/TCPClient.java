package com.zxyuan.leetcode.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ZXYUAN
 * @date 2019-08-02 20:25
 */
public class TCPClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 65000);

        InputStream inputStream = socket.getInputStream();

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hahahahahhhha".getBytes());

        int ch = 0;
        byte[] buff = new byte[1024];
        ch = inputStream.read(buff);

        String content = new String(buff, 0, ch);
        System.out.println(content);
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
