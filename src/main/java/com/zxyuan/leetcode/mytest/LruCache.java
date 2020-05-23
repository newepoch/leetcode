package com.zxyuan.leetcode.mytest;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ZXYUAN
 * @date 2019-08-19 00:37
 */
public class LruCache {

    private Map<Integer, Integer> cache;

    private Integer capacity;

    public LruCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75F, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public void put(int k, int v) {
        cache.put(k, v);
    }

    public int get(int k) {
        return cache.getOrDefault(k, -1);
    }

    public static void main(String[] args) {
        LruCache lruCache = new LruCache(2);
        lruCache.put(1,1);
        lruCache.get(1);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);
        lruCache.get(2);
        lruCache.put(4,4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }

}
