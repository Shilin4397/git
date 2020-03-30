package sort;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public  class Main {
    public static int findKth(int[] a, int n, int K) {
        // write code here
//            int left = 0;
//            int right = a.length-1;
//            int ret = a[0];
//            while(left < right) {
//                while(left < right && a[left] <= ret) {
//                    left++;
//                }
//                while(left < right && a[left] >= ret) {
//                    right--;
//                }
//            }
        PriorityQueue q = new PriorityQueue(a.length);
        for(int i = 0;i < a.length;i++) {
            q.offer(a[i]);
        }
        int len = a.length;
        while((len - K) > 0) {
            q.poll();
            len--;
        }

        return (int)q.poll();
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        System.out.println(findKth(arr,5,3));
    }
}

