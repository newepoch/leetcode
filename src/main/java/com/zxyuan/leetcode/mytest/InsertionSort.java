package com.zxyuan.leetcode.mytest;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author ZXYUAN
 * @date 2019-07-15 11:21
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] req = new int[]{2, 1, 4, 3, 8, 10, 6, 7, 9};
        for (int i = 1, j, current; i < req.length; i++) {
            current = req[i];
            for (j = i - 1; j >= 0 && req[j] > current; j--) {
                req[j + 1] = req[j];
            }
            req[j + 1] = current;
        }
        System.out.println(Arrays.toString(req));
    }
}
