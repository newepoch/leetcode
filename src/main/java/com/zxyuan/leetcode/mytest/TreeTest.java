package com.zxyuan.leetcode.mytest;

import com.zxyuan.leetcode.entity.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树
 *
 * @author ZXYUAN
 * @date 2019-07-27 22:22
 */
public class TreeTest {

    public TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode node = null;
        if (inputList == null || inputList.size() == 0) {
            return null;
        }
        Integer data = inputList.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.left = createBinaryTree(inputList);
            node.right = createBinaryTree(inputList);
        }
        return node;
    }

    /**
     * 前序遍历
     *
     * @param node
     */
    public void preOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrderTraveral(node.left);
        preOrderTraveral(node.right);

    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public void inOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraveral(node.left);
        System.out.println(node.val);
        inOrderTraveral(node.right);

    }

    /**
     * 后序遍历
     *
     * @param node
     */
    public void postOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraveral(node.left);
        postOrderTraveral(node.right);
        System.out.println(node.val);
    }

    public void preOrderTraveralWithStack(TreeNode node) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        TreeNode treeNode = node;
        if (treeNode != null || !treeNodeStack.isEmpty()) {
            while (treeNode != null) {
                System.out.println(treeNode.val);
                treeNodeStack.push(treeNode);
                treeNode = treeNode.left;
            }
            if (!treeNodeStack.isEmpty()) {
                treeNode = treeNodeStack.pop();
                treeNode = treeNode.right;
            }
        }
    }

    public void levelOrderTraversal(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            System.out.println(treeNode.val);
            if (treeNode.left != null) {
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.offer(treeNode.right);
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(3, 2, 9, null, null, 10, null, null, 8, null, 4));
        TreeTest treeTest = new TreeTest();
        TreeNode binaryTree = treeTest.createBinaryTree(linkedList);
        //System.out.println(binaryTree);
        System.out.println("前序遍历");
        treeTest.preOrderTraveral(binaryTree);
        System.out.println("中序遍历");
        treeTest.inOrderTraveral(binaryTree);
        System.out.println("后序遍历");
        treeTest.postOrderTraveral(binaryTree);
        System.out.println("前序遍历");
        treeTest.levelOrderTraversal(binaryTree);

    }
}
