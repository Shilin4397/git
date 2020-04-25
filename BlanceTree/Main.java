package git.BlanceTree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Main {
    public int getHeight(TreeNode root) {
        if(root==null) {
            return 0;
        }
        int L= 1+getHeight(root.left);
        int R= 1+getHeight(root.right);
        return L>R?L:R;
    }
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null) {
            return true;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if(Math.abs(l - r) > 1) {
            return false;
        }
        isBalance(root.left);
        isBalance(root.right);
        return true;
    }
}

