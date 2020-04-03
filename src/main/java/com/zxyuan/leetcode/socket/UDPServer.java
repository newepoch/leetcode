package com.zxyuan.leetcode.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author ZXYUAN
 * @date 2019-08-02 20:25
 */
public class UDPServer {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(65001);
        byte[] buff = new byte[100];
        DatagramPacket datagramPacket = new DatagramPacket(buff, buff.length);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        String contant = new String(data, 0, data.length);

        System.out.println(contant);
        byte[] bytes = String.valueOf(contant.length()).getBytes();
        DatagramPacket packetToClient = new DatagramPacket(bytes, bytes.length, datagramPacket.getAddress(), datagramPacket.getPort());
        datagramSocket.send(packetToClient);

    }
}
