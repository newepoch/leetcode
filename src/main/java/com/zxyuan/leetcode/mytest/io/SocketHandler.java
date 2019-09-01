package com.zxyuan.leetcode.mytest.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ZXYUAN
 * @date 2019-08-13 19:09
 */
public class SocketHandler implements Runnable {
    private Socket socket;

    public SocketHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = socket.getInputStream();
            out = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            while (true) {
                //会阻塞
                int n = in.read(bytes);
                if (n == -1) {
                    break;
                }
                System.out.println(new String(bytes, 0, n));
                out.write(bytes,0,n);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                System.out.print("关闭 socket");
                socket.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if(in!=null) {
                    in.close();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            try {
                if(out!=null) {
                    out.close();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}