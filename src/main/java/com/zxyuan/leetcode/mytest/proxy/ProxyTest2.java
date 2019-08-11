package com.zxyuan.leetcode.mytest.proxy;

/**
 * @author ZXYUAN
 * @date 2019-08-11 20:45
 */
public class ProxyTest2 {
    public static void main(String[] args) {
        Alipay alipay = new Alipay(new PaymentImpl());
        alipay.pay();
    }
}
