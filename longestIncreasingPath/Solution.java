package longestIncreasingPath;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Solution {

    //给定一个整数矩阵，找出最长递增路径的长度。
    //对于每个单元格，你可以往上，下，左，右四个方向移动。 你不能在对角线方向上移动或移动到边界外（即不允许环绕）。
//    public int longestIncreasingPath(int[][] matrix) {
//        int[] nums = new int[matrix.length*matrix[0].length];
//        int index = 0;
//        for(int i = 0;i < matrix.length;i++) {
//            for (int j = 0;j < matrix[i].length;j++) {
//                nums[index++] = longest(matrix,i,j);
//            }
//        }
//        int max = nums[0];
//        for (int x:nums) {
//            if(max < x) {
//                max = x;
//            }
//        }
//        return max;
//    }
//
//    public int longest(int[][] matrix,int i,int j) {
//
//        if(i > 0 && i< matrix.length) {
//            if(matrix[i-1][j] > matrix[i][j])
//                return 1+longest(matrix,i-1,j);
//        }
//        if(j > 0 && j <matrix[i].length) {
//            if(matrix[i][j-1] > matrix[i][j])
//                return 1+longest(matrix,i,j-1);
//        }
//        if(i < matrix.length-1 && i>=0) {
//            if(matrix[i+1][j] > matrix[i][j])
//                return 1+longest(matrix,i+1,j);
//        }
//        if(j < matrix.length-1 && j >= 0) {
//            if(matrix[i][j+1] > matrix[i][j])
//                return 1+longest(matrix,i,j+1);
//        }
//        return 1;
//    }


    private static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int m, n;

    public int longestIncreasingPath(int[][] matrix) {
        //如果数组为空则直接返回
        if(matrix.length < 1) return 0;
        m = matrix.length;
        n = matrix[0].length;
        int[][] nums = new int[m][n];
        int route = 0;
        //遍历matrix中的元素，求每一个元素的最大路径
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                route = Math.max(route,dfs(matrix,i,j,nums));
            }
        }
        return route;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] cache) {
        if(cache[i][j] != 0) return cache[i][j];
        //让cache[i][j]递归在矩阵中上下左右移动；
        for(int[] d:dirs) {
            int x = i + d[0];
            int y = j + d[1];
            if(x >= 0 && x < m && y >= 0 && y < n && matrix[i][j] < matrix[x][y]) {
                cache[i][j] = Math.max(cache[i][j],dfs(matrix,x,y,cache));
            }
        }
        return ++cache[i][j];
    }

    public static void main(String[] args) {
        int[][] nums = {{9,9,4},{6,6,8},{2,1,1}};
        Solution s = new Solution();
        System.out.println(s.longestIncreasingPath(nums));
    }
}
