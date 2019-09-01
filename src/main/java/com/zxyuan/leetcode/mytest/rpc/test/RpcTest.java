package com.zxyuan.leetcode.mytest.rpc.test;

import com.zxyuan.leetcode.mytest.rpc.client.RPCClient;
import com.zxyuan.leetcode.mytest.rpc.server.Server;
import com.zxyuan.leetcode.mytest.rpc.server.ServiceCenter;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * @author ZXYUAN
 * @date 2019-08-13 14:09
 */
public class RpcTest {

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            Server serviceCenter = new ServiceCenter(8088);
            serviceCenter.register(HelloService.class, HelloServiceImpl.class);
            try {
                serviceCenter.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
