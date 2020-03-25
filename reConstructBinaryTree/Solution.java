package git.reConstructBinaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    //输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
    // 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
    // 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和
    // 中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //判断树是否存在
        if(pre.length == 0) {
            return null;
        }
        int i = 0;
        //创建根节点
        TreeNode root = new TreeNode(pre[0]);
        //在中序中找根
        while(in[i] != pre[0]) {
            i++;
        }
        //递归创建左子树
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
        //递归创建右子树
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),
                Arrays.copyOfRange(in,i+1,pre.length));
        return root;
    }

    //输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
    // 假设输入的后序遍历和中序遍历的结果中都不含重复的数字。
    public  TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0) {
            return null;
        }
        int i = postorder.length-1;
        int val = postorder[i];
        TreeNode root = new TreeNode(val);
        while(i > 0 && inorder[i] != val) {
            i--;
        }
        root.right = buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),Arrays.copyOfRange(postorder,
                i,postorder.length-1));
        root.left = buildTree(Arrays.copyOfRange(inorder,0,i),Arrays.copyOfRange(postorder,0,i));

        return root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {9,3,15,20,7};
        int[] brr = {9,15,7,20,3};
        s.buildTree(arr,brr);

    }
}



