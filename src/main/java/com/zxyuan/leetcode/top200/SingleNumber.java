package com.zxyuan.leetcode.top200;

/**
 * 136. 只出现一次的数字
 *
 * @author ZXYUAN
 * @date 2019-07-14 21:54
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 5, 4, 3, 2, 1};
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        System.out.println(result);
    }
}
