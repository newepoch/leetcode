package com.zxyuan.leetcode.mytest.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.rmi.server.ExportException;
import java.util.concurrent.CountDownLatch;

/**
 * @author ZXYUAN
 * @date 2019-08-11 21:24
 */
public class AIOServer {

    public void serve(int port) throws IOException {
        final AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open();
        InetSocketAddress address = new InetSocketAddress(port);
        serverChannel.bind(address);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        serverChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel result, Object attachment) {
                serverChannel.accept(null, this);
                ByteBuffer byteBuffer = ByteBuffer.allocate(100);
                //result.read(byteBuffer,byteBuffer,new EchoComp)
            }

            @Override
            public void failed(Throwable exc, Object attachment) {

            }
        });


    }
}
