package com.zxyuan.leetcode.mytest.proxy;

/**
 * @author ZXYUAN
 * @date 2019-08-11 18:45
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
        UserService proxy = (UserService)myInvocationHandler.getProxy();
        proxy.add();
    }
}
