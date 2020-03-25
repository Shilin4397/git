package git.Find;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Solution {
    //方法一
    public boolean Find(int target, int [][] array) {

        if(array.length <= 0) {
            return false;
        }
        for(int i = 0;i < array.length;i++) {
            if(find(target,array[i]) == true) {
                return true;
            }
        }
        return false;
    }

    public boolean find(int target,int[] array) {
        int star = 0;
        int len2 = array.length-1;
        while(star <= len2) {
            int mid = (star + len2)/2;
            if(array[mid] == target) {
                return true;
            }else if(array[mid] < target) {
                star = mid + 1;
            }else {
                len2 = mid - 1;
            }
        }
        return false;
    }

    //方法二，从右下角开始找
    public boolean Find1(int target, int [][] array) {
        if(array.length <= 0) return false;
        int i = 0;
        for(i = array.length-1;i >= 0;i--) {
            if(array[i][0] == target) {
                return true;
            }
            if(array[i][0] < target) {
                break;
            }
        }
        if(array[i][0] > target) {
            return false;
        }
        for(int j = 0;j < array[0].length;j++) {
            if(array[i][j] == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,2,4},{1,7,9},{5,7,8}};
        Solution s = new Solution();
        System.out.println(s.Find1(4,arr));
    }
}
