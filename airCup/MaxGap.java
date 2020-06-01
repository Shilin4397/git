package git.airCup;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int allMax = 0;
        int max1 = A[0];
        int k = 0;
        while (k < n-1) {
            if(max1 < A[k]) {
                max1 = A[k];
            }
            int max2 = A[k+1];
            for(int i = k+1; i < n; i++) {
                if(max2 < A[i]) {
                    max2 = A[i];
                }
            }
            int m = max1 - max2;
            if(m < 0) {
                m *= -1;
            }
            if(allMax < m) {
                allMax = m;
            }
            k++;
        }
        return allMax;
    }

    public static void main(String[] args) {
        MaxGap m = new MaxGap();
        int[] arr = {15,30,61,99};
        int n = 4;
        int s = m.findMaxGap(arr,n);
        System.out.println(s);
    }
}
