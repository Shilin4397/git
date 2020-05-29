package git.airCup;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class LotNumber {
    public int MoreThanHalfNum_Solution(int [] array) {
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(array[0]);
//        for (int i = 1; i < array.length; i++) {
//            if(q.peek() != array[i]) {
//                q.poll();
//                q.offer(array[i]);
//            }
//        }
//        return q.peek();
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        int n = (array.length+1)/2;
        int mid = array[(left + right)/2];
        while (left < right) {
            if(array[left] != mid) {
                left++;
            }
            if(array[right] != mid) {
                right--;
            }
            if(array[left] == array[right]) {
                break;
            }
        }
        if((right - left +1) >= n) {
            return mid;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,2,5,4,2};
        LotNumber l = new LotNumber();
        System.out.println(l.MoreThanHalfNum_Solution(arr));
    }
}
