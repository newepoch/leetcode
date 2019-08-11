package com.zxyuan.leetcode.mytest.proxy;

/**
 * @author ZXYUAN
 * @date 2019-08-11 20:41
 */
public class Alipay implements Payment {

    private Payment payment;
    public Alipay(Payment payment){
        this.payment = payment;
    }

    private void before() {
        System.out.println("支付之前");
    }
    @Override
    public void pay() {
        before();
        payment.pay();
        after();
    }

    private void after() {
        System.out.println("支付之后");
    }
}
