package com.zxyuan.leetcode.top100;

/**
 * 14. 最长公共前缀
 *
 * @author ZXYUAN
 * @date 2019-07-26 14:54
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) return "";
        // 最短字符串
        String shortStr = strings[0];
        // 获取最短字符串
        for (String string : strings) {
            if (string.length() < shortStr.length()) {
                shortStr = string;
            }
        }
        StringBuilder result = new StringBuilder();
        char[] chars = shortStr.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            for (int i = 0; i < strings.length; i++) {
                if (chars[j] != strings[i].charAt(j)) {
                    return result.toString();
                }
                if (i == strings.length - 1) {
                    result.append(chars[j]);
                }
            }
        }
        return result.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public String longestCommonPrefix3(String[] strs) {
        if (strs.length == 0) return "";
        for (int j = 0; j < strs[0].toCharArray().length; j++) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(j) != strs[0].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        int ab = "abcd".indexOf("cd");
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix3(new String[]{"asbf", "asdfgh", "asd", "asdfghjkl"}));
    }
}
