package git.Mirror;

import org.omg.CORBA.TRANSACTION_MODE;
import sun.reflect.generics.tree.Tree;

import java.util.Queue;
import java.util.Stack;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

 class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
        this.val = val;
     }
 }

public class Solution {
    public static void Mirror(TreeNode root) {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode cur = stack.pop();
            if(cur.right != null) {
                stack.push(cur.right);
            }
            if(cur.left != null) {
                stack.push(cur.left);
            }
            TreeNode cur1;
            cur1 = cur.right;
            cur.right = cur.left;
            cur.left = cur1;
        }
    }

    public static void main(String[] args) {
        TreeNode r = new TreeNode(8);
        TreeNode r1 = new TreeNode(6);
        TreeNode r2 = new TreeNode(10);
        TreeNode r3= new TreeNode(5);
        TreeNode r4 = new TreeNode(7);
        TreeNode r5 = new TreeNode(9);
        TreeNode r6 = new TreeNode(11);

        r.left = r1;
        r.right = r2;
        r1.left = r3;
        r1.right = r4;
        r2.left = r5;
        r2.right = r6;

        Mirror(r);

    }
}
