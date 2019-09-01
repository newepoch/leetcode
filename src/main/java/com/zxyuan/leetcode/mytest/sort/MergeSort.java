package com.zxyuan.leetcode.mytest.sort;

/**
 * 归并排序
 *
 * @author ZXYUAN
 * @date 2019-07-15 12:19
 */
public class MergeSort {
    public static void main(String[] args) {

        int[] req = new int[]{2, 1, 4, 3, 8, 10, 6, 7, 9};
        sort(req,0,8);
    }

    public static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;

        sort(a, lo, hi);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public static void merge(int[] nums, int lo, int mid, int hi) {
        int[] copy = nums.clone();
        int k = lo, i = lo, j = mid + 1;
        while (k <= hi) {
            if (i > mid) {
                nums[k++] = copy[j++];
            } else if (j > hi) {
                nums[k++] = copy[i++];
            } else if (copy[j] < copy[i]) {
                nums[k++] = copy[j++];
            } else {
                nums[k++] = copy[i++];
            }
        }
    }
}
