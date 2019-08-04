package com.zxyuan.leetcode.mytest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ZXYUAN
 * @date 2019-08-03 07:15
 */
public class VolitaleTest {
    public static volatile int s = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}
