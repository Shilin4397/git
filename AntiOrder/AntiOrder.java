package git.AntiOrder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class AntiOrder {
    public int count(int[] A, int n) {
        // write code here
        if(n > 5000) {
            return 0;
        }
        int count = 0;
        for(int i = 0;i < n-1;i++) {
            for(int j = i+1;j < n; j++) {
                if(A[i] > A[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
