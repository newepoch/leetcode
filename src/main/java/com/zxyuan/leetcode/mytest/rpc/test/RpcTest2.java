package com.zxyuan.leetcode.mytest.rpc.test;

import com.zxyuan.leetcode.mytest.rpc.client.RPCClient;

import java.net.InetSocketAddress;

/**
 * @author ZXYUAN
 * @date 2019-08-13 14:20
 */
public class RpcTest2 {
    public static void main(String[] args) {
        HelloService service = RPCClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(System.currentTimeMillis() + "代码执行前");
        String test = service.sayHello("test");
        System.out.println(test);
        System.out.println(System.currentTimeMillis() + "代码执行完");
    }
}
