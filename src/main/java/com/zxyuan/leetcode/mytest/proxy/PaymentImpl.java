package com.zxyuan.leetcode.mytest.proxy;

/**
 * @author ZXYUAN
 * @date 2019-08-11 20:40
 */
public class PaymentImpl implements Payment {
    @Override
    public void pay() {
        System.out.println("支付");
    }
}
