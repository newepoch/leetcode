package com.zxyuan.leetcode.mytest;

import com.google.common.primitives.Ints;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ZXYUAN
 * @date 2019-07-15 14:11
 */
public class Test {

    public int[] onlyOneNums(int[] nums) {
        if (nums == null || nums.length == 0){
            return nums;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        //遍历数组，加入map，值记录出现次数
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            Integer times = map.get(currentNum);
            map.put(currentNum, times == null ? 1 : times + 1);
        }
        //过了map中值为1 的数据
        List<Integer> list = map.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        return Ints.toArray(list);
    }
}
