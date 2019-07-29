package com.zxyuan.leetcode.top100;

import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * @author ZXYUAN
 * @date 2019-07-26 17:57
 */
public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = Maps.newHashMap();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        return 1;
    }
}
