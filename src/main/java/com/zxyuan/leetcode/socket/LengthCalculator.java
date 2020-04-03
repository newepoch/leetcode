package com.zxyuan.leetcode.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ZXYUAN
 * @date 2019-08-02 20:34
 */
public class LengthCalculator extends Thread {

    private Socket socket;

    public LengthCalculator(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
            OutputStream outputStream = socket.getOutputStream();

            InputStream inputStream = socket.getInputStream();

            int ch = 0;

            byte[] buff = new byte[1024];

            ch = inputStream.read(buff);

            String content = new String(buff, 0, ch);

            System.out.println(content);

            outputStream.write(String.valueOf(content.length()).getBytes());
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
