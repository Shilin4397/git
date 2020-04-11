package git.funcArray;
import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {
    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int sum = 1;
            for (int j = 0; j < A.length; j++) {
                if(i != j) {
                    sum *= A[j];
                }
            }
            B[i] = sum;
        }
        return B;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(multiply(A)));
    }
}
