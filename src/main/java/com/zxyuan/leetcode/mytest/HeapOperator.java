package com.zxyuan.leetcode.mytest;

import java.util.Arrays;

/**
 * 二叉堆
 *
 * @author ZXYUAN
 * @date 2019-07-25 13:56
 */
public class HeapOperator {


    public void up(int[] array) {
        int childIndex = array.length - 1;
        int parentIndex = (childIndex - 1) >> 1;
        // temp 保存插入叶子节点值，用于最后赋值
        int temp = array[childIndex];
        while (childIndex > 0 && temp < array[parentIndex]) {
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (childIndex - 1) >> 1;
        }
        array[childIndex] = temp;
    }

    public void down(int[] array, int parentIndex, int length) {
        int childIndex = (parentIndex << 1) + 1;
        int temp = array[parentIndex];
        while (childIndex < length) {
            // 存在右节点 并且 右节点小于左节点，则与右节点交换
            if (childIndex + 1 < length && array[childIndex] > array[childIndex + 1]) {
                childIndex++;
            }
            // 如果父节点小于任意一个子节点 则直接跳出
            if (array[childIndex] > temp) {
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = (parentIndex << 1) + 1;
        }
        array[parentIndex] = temp;
    }

    public void build(int[] array) {
        for (int i = (array.length - 2) >> 1; i >= 0; i--) {
            down(array, i, array.length);
        }
    }

    public static void main(String[] args) {
        int[] ints = {7, 5, 3, 4, 9, 6, 4, 2, 5, 8, 5, 1};
        HeapOperator heapOperator = new HeapOperator();
        heapOperator.build(ints);
        System.out.println(Arrays.toString(ints));
    }
}