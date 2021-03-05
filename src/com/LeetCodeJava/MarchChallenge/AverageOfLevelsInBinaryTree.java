package com.LeetCodeJava.MarchChallenge;

/*
 * March 5 Challenge -  Average of Levels in Binary Tree
 *
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * Example 1:
 * Input:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Output: [3, 14.5, 11]
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 *
 *
 */

import com.LeetCodeJava.ObjectLib.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        ArrayList<TreeNode> next = new ArrayList<>();
        List<Double> res = new ArrayList<>();

        if(root == null){
            return res;
        }

        next.add(root);

        while (next.size() != 0) {

            double sum = 0;
            for(TreeNode node: next){
                sum += node.val;
                stack.push(node);
            }
            res.add(sum / next.size());

            next = new ArrayList<>();
            while (stack.size() != 0) {
                TreeNode popped = stack.pop();

                if (popped.right != null)
                    next.add(popped.right);

                if (popped.left != null)
                    next.add(popped.left);
            }

        }

        return res;
    }
}
