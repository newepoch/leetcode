package com.zxyuan.leetcode.mytest.classload;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ZXYUAN
 * @date 2019-09-01 2:01 下午
 */
public class InvokeTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<A> aClass = A.class;
        A a = aClass.newInstance();

        Method print = aClass.getMethod("print", int.class, int.class);

        System.out.println(aClass.getName());

        print.invoke(a, 10, 20);
    }
}
