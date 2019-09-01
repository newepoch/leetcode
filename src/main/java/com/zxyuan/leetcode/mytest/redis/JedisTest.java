package com.zxyuan.leetcode.mytest.redis;

import redis.clients.jedis.Jedis;

/**
 * @author ZXYUAN
 * @date 2019-08-25 7:09 下午
 */

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

    }
}
