package com.zxyuan.leetcode.top100;

/**
 * 9. 回文数
 *
 * @author ZXYUAN
 * @date 2019-07-26 17:38
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int last = 0;
        while (x > last){
            last = last * 10 + x % 10;
            x /= 10;
        }
        return x == last || x == last / 10;
    }
}
