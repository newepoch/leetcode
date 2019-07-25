package com.zxyuan.leetcode.top900;

/**
 * 836.矩形重叠
 *
 * @author ZXYUAN
 * @date 2019-07-15 13:55
 */
public class RectangleOverlap {
    public static void main(String[] args) {
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};

        System.out.println(Math.max(rec1[0], rec2[0]) < Math.min(rec1[2], rec2[2]) && Math.max(rec1[1], rec2[1]) < Math.min(rec1[3], rec2[3]));
    }
}
/*
                       3,3

               2,2

           1,1

    0,0

 */
