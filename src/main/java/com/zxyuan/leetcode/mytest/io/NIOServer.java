package com.zxyuan.leetcode.mytest.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ZXYUAN
 * @date 2019-08-11 21:24
 */
public class NIOServer {
//    public void serve(int port) throws IOException {
//        System.out.println("监听连接，端口：" + port);
//        ServerSocketChannel socketChannel = ServerSocketChannel.open();
//        ServerSocket socket = socketChannel.socket();
//        InetSocketAddress address = new InetSocketAddress(port);
//        socket.bind(address);
//        socketChannel.configureBlocking(false);
//        Selector selector = Selector.open();
//        // 将channel注册到selector中，说明让select关注的点，这里是关注建立连接这个事件
//        socketChannel.register(selector, SelectionKey.OP_ACCEPT);
//
//        while (true) {
//            //阻塞等待就绪的channel，即没有与客户端建立连接前就一直轮询
//            selector.select();
//        }
//        // 获取到selector中所有就绪的selectorKey实例，每将一个channel注册到一个selector就会产生一个selector
//        Set<SelectionKey> readyKeys = selector.selectedKeys();
//        Iterator<SelectionKey> iterator = readyKeys.iterator();
//        while (iterator.hasNext()) {
//            SelectionKey key = iterator.next();
//            iterator.remove();
//            // 若selectorKey处于accept状态
//            if (key.isAcceptable()) {
//                ServerSocketChannel server = (ServerSocketChannel) key.channel();
//                SocketChannel client = server.accept();
//                client.configureBlocking(false);
//                // 向selector注册socketCHannel,主要关注读写，并传入bytebuffer实例供读写缓存
//                client.register(selector, SelectionKey.OP_WRITE | SelectionKey.OP_READ, ByteBuffer.allocate(100));
//
//            }
//            // 若selectorKey状态为可读状态
//            if (key.isReadable()) {
//                SocketChannel client = (SocketChannel)key.channel();
//                ByteBuffer output = (ByteBuffer)key.attachment();
//                client.read(output);
//            }
//            // 若selector状态为可写状态
//            if (key.isWritable()) {
//                SocketChannel client = (SocketChannel) key.channel();
//                ByteBuffer output = (ByteBuffer) key.attachment();
//                client.write(output);
//                // 将数据从缓存中移除
//                output.compact();
//            }
//        }
//
//
//    }
}
