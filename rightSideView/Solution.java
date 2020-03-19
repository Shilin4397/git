package rightSideView;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        //树为空直接返回
        if(root == null) {
            return list;
        }
        //层序遍历二叉树
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode cur = root;
        while(!q.isEmpty()) {
            //size记录队列的元素
            int size = q.size();
            //记录队列中最后一个元素，并将其值放入list中
            while(size > 0) {
                cur = q.poll();
                if(cur.left != null) {
                    q.add(cur.left);
                }
                if(cur.right != null) {
                    q.add(cur.right);
                }
                size--;
            }
            list.add(cur.val);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.right = n5;
        n3.right = n4;

        for (int s:rightSideView(n1)) {
            System.out.print(s + " ");
        }

    }
}
