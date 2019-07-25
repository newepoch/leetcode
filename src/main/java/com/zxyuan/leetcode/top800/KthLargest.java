package com.zxyuan.leetcode.top800;

import java.util.PriorityQueue;

/**
 * @author ZXYUAN
 * @date 2019-07-24 19:01
 */
public class KthLargest {
    final PriorityQueue<Integer> queue;

    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.queue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else if (queue.peek() < val) {
            Integer poll = queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        new KthLargest(6, new int[]{1, 2, 5, 3, 6, 4, 9,7});
    }

}
