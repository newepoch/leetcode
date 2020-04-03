package com.zxyuan.leetcode.socket;

import java.net.*;

/**
 * @author ZXYUAN
 * @date 2019-08-02 20:25
 */
public class UDPClient {

    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();

        byte[] buff = "hello world".getBytes();

        InetAddress address = InetAddress.getByName("127.0.0.1");
        DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length, address, 65001);

        socket.send(datagramPacket);

        byte[] data = new byte[100];
        DatagramPacket receivedPacket = new DatagramPacket(data, data.length);
        socket.receive(receivedPacket);
        String content = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println(content);

    }
}
