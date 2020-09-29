package git.niuke;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

//给定一个无序数组arr，找到数组中未出现的最小正整数
//例如arr = [-1, 2, 3, 4]。返回1
//arr = [1, 2, 3, 4]。返回5
//[要求]
//时间复杂度为O(n)O(n)O(n)，空间复杂度为O(1)O(1)O(1)

public class MinNum {
    public static int minNumberdisappered (int[] arr) {
        // write code here
        int len = arr.length;
        int[] count = new int[len+1];
        for (int i = 0; i < len; i++) {
            if(arr[i] < len+1 && arr[i] > 0)
                count[arr[i]]++;
        }
        for (int i = 1; i < len+1; i++) {
            if(count[i] == 0)
                return i;
        }
        return len+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = minNumberdisappered(arr);
        System.out.println(n);
    }
}
