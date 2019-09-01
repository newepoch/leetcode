package com.zxyuan.leetcode.mytest.classload;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author ZXYUAN
 * @date 2019-09-01 2:32 下午
 */
public class InvokeTest2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> strings = new ArrayList<>();
        Class<? extends ArrayList> c = strings.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(strings, 1);
        add.invoke(strings, "gaha");
        System.out.println(strings);


    }
}
