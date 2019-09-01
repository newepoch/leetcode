package com.zxyuan.leetcode.top100;

import java.util.Arrays;

/**
 * @author ZXYUAN
 * @date 2019-08-20 23:04
 */
public class MergeArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[p--] = nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--];
        }
        return nums1;
    }

    public static void main(String[] args) {
        MergeArray mergeArray = new MergeArray();
        int[] merge = mergeArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(merge));

    }
}
