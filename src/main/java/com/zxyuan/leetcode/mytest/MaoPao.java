package com.zxyuan.leetcode.mytest;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author ZXYUAN
 * @date 2019-07-15 11:07
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] req = new int[]{2, 1, 4, 3, 8, 10, 6, 7, 9};
        boolean hasChange = true;
        while (hasChange) {
            hasChange = false;
            for (int j = 0; j < req.length-1; j++) {
                if (req[j] > req[j + 1]) {
                    req[j] ^= req[j + 1];
                    req[j + 1] ^= req[j];
                    req[j] ^= req[j + 1];
                    hasChange = true;
                }
            }
        }
        System.out.println(Arrays.toString(req));
    }
}
