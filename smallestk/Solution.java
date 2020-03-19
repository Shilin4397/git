package smallestk;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Solution {
    public int[] smallestk(int[] arr,int k) {
        int[] ret = new int[k];
        if(arr == null || k <= 0) {
            return ret;
        }
        PriorityQueue<Integer> p = new PriorityQueue<>(arr.length);

        for (int x:arr) {
            p.offer(x);
        }

        for(int i = 0;i < k;i++) {
            ret[i] = p.poll();
        }
        return ret;
    }
}
