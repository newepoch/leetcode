package com.zxyuan.leetcode.top100;


/**
 * 2.两数相加
 *
 * @author ZXYUAN
 * @date 2019-07-11 13:44
 */
public class AddTwoNumbers {
    public static void main(String[] args) {

        ListNode g = new ListNode(1);
        ListNode s = new ListNode(2);
        ListNode b = new ListNode(5);
        s.nextNode=b;
        g.nextNode=s;
        ListNode listNode = addTwoNumbers(g, g);
        System.out.println(listNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;
        int carry = 0;
        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.nextNode = new ListNode(sum % 10);
            curr = curr.nextNode;
            if (p != null) {
                p = p.nextNode;
            }
            if (q != null) {
                q = q.nextNode;
            }
        }
        if (carry > 0) {
            curr.nextNode = new ListNode(0);
        }
        return result;
    }

     static class ListNode {

        int val;
        ListNode nextNode;

        ListNode(int val) {
            this.val = val;
            this.nextNode = null;
        }
    }
}

//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
//        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//        示例：
//
//        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//        输出：7 -> 0 -> 8
//        原因：342 + 465 = 807
