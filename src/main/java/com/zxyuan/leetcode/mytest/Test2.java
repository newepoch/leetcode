package com.zxyuan.leetcode.mytest;

/**
 * @author ZXYUAN
 * @date 2019-07-15 14:59
 */
public class Test2 {
    private static volatile Test2 test2;

    private Test2() {
    }

    public static Test2 getTest2() {
        synchronized ("") {
            if (test2 == null) {
                test2 = new Test2();
            }
        }
        return test2;
    }
}
