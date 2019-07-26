package com.zxyuan.leetcode.top100;

/**
 * 7. 整数反转
 *
 * @author ZXYUAN
 * @date 2019-07-26 17:19
 */
public class Reverse {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10
                    || (result == Integer.MAX_VALUE / 10 && pop > 7) || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }
}
