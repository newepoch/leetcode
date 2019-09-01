package com.zxyuan.leetcode.mytest.sort;

import java.util.Arrays;

/**
 * 计数排序
 *
 * @author ZXYUAN
 * @date 2019-07-29 13:50
 */
public class CountSort {
    public static int[] countSort(int[] array) {
        // 1.得到数列最大值和最小值，并算出差值
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        // 差值
        int d = max - min;

        // 2.创建统计数组并统计对应元素的个数
        int[] countArray = new int[d + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        // 3.统计数组做变型，后面的元素等于前面的元素之和
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        // 4.倒序遍历原始数列，从统计数组找到正确位置，输出到结果数组
        int[] sortedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[countArray[array[i] - min] - 1] = array[i];
            countArray[array[i] - min]--;
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] arr = {4, 4, 6, 5, 3, 2, 8, 1};

        int[] sort = countSort(arr);
        System.out.println(Arrays.toString(sort));

    }
}
