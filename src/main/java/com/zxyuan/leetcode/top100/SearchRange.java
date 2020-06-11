package com.zxyuan.leetcode.top100;


import java.util.Arrays;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length < 1) {
            return new int[]{-1, -1};
        }
        int low = searchLowerBound(nums, target, 0, nums.length - 1);
        int high = searchUpperBound(nums, target, 0, nums.length - 1);
        return new int[]{low, high};

    }

    public int searchLowerBound(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int m = low + (high - low) / 2;
        if (nums[m] == target && (m == 0 || nums[m-1] < target)) {
            return m;
        }
        if (target <= nums[m]) {
            return searchLowerBound(nums, target, low, m - 1);
        } else {
            return searchLowerBound(nums, target, m + 1, high);
        }
    }

    public int searchUpperBound(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int m = low + (high - low) / 2;
        if (nums[m] == target && (m == nums.length - 1 || nums[m + 1] > target)) {
            return m;
        }
        if (target < nums[m]) {
            return searchUpperBound(nums, target, low, m - 1);
        } else {
            return searchUpperBound(nums, target, m + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5};
        int target = 1;
        SearchRange searchRange = new SearchRange();
        System.out.println(Arrays.toString(searchRange.searchRange(nums, target)));
    }

}
