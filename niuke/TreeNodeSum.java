package git.niuke;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

//给定一个二叉树和一个值 sum
//判断是否有从根节点到叶子节点的节点值之和等于 sum的路径，

class TreeNode {
   int val = 0;
   TreeNode left = null;
   TreeNode right = null;
}
public class TreeNodeSum {
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if(root == null)
            return false;
        if(root.left == null && root.right == null && sum == root.val)
            return true;
        return hasPathSum(root.left, sum-root.val) ||
                hasPathSum(root.right, sum-root.val);
    }
}
