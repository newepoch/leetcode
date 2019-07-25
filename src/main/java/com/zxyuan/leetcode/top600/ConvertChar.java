package com.zxyuan.leetcode.top600;

/**
 * 557.反转字符串中的单词 III
 *
 * @author ZXYUAN
 * @date 2019-07-14 11:11
 */
public class ConvertChar {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        StringBuilder result = new StringBuilder();
        String[] array = s.split(" ");
        for (String s1 : array) {
            char[] chars = s1.toCharArray();
            int length = chars.length;
            for (int i = 0; i < length / 2; i++) {
                chars[i] ^= chars[length - 1 - i];
                chars[length - 1 - i] ^= chars[i];
                chars[i] ^= chars[length - 1 - i];
            }
            result.append(chars).append(" ");
        }
        System.out.println(result.substring(0,result.length()-1));
    }
}
