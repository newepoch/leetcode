package com.zxyuan.leetcode.top300;

import com.zxyuan.leetcode.entity.ListNode;

/**
 * 206. 反转链表
 *
 * @author ZXYUAN
 * @date 2019-08-10 07:10
 */
public class ReverseList {
    public ListNode reverseList(ListNode node) {
        ListNode result = null, p1, p2;
        p2 = node;
        while (p2.nextNode != null) {
            p1 = new ListNode(p2.val);
            p1.nextNode = result;
            result = p1;
            p2 = p2.nextNode;
        }
        p2.nextNode = result;
        return p2;
    }

    public ListNode reverseList2(ListNode node) {
        ListNode result = null;
        ListNode current = node;
        while (current != null) {
            ListNode nextTemp = current.nextNode;
            current.nextNode = result;
            result = current;
            current = nextTemp;
        }
        return result;
    }

    public ListNode reverseList3(ListNode node) {
        if (node == null || node.nextNode == null) {
            return node;
        }
        ListNode nextNode = reverseList3(node.nextNode);
        node.nextNode.nextNode = node;
        node.nextNode = null;
        return nextNode;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        for (int i = 1; i < 10; i++) {
            ListNode listNode = new ListNode(i);
            listNode.nextNode = node;
            node = listNode;
        }
        ReverseList reverseList = new ReverseList();
        ListNode listNode = reverseList.reverseList3(node);
    }
}
