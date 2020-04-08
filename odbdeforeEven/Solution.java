package git.odbdeforeEven;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
// 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
// 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Solution {

    public static void reOrderArray(int [] array) {
        int[] nums = new int[array.length];
        int[] nums2 = new int[array.length];
        int j = -1;
        int k = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                nums[++k] = array[i];
            }else {
                nums2[++j] = array[i];
            }
        }

        System.arraycopy(nums2,0,array,0,j+1);
        System.arraycopy(nums,0,array,j+1,k+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
