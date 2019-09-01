package com.zxyuan.leetcode.mytest.rpc.test;

/**
 * @author ZXYUAN
 * @date 2019-08-12 17:58
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String s) {
        System.out.println(System.currentTimeMillis() + "代码执行前");
        return "hello" + s;
    }
}
