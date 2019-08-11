package com.zxyuan.leetcode.mytest;

import java.util.concurrent.*;

/**
 * @author ZXYUAN
 * @date 2019-08-03 07:15
 */
public class VolitaleTest {
    public static volatile int s = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        new ThreadPoolExecutor(5,
                10, 5,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(5)

        );

    }
}
