package git.airCup;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class SingSong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] students = new int[n];
            int max = 0;
            for(int i = 0; i < n; i++) {
                students[i] = in.nextInt();
                if(students[max] < students[i]) {
                    max = i;
                }
            }
            int k = in.nextInt();
            int d = in.nextInt();
            fun(students,k,d,max);
        }
    }
    public static void fun(int[] arr, int k, int d, int n) {
        int sum = arr[n];
        arr[n] = -51;
        while (k > 1) {
            int left = n-d;
            int right = n+d;
            if(left < 0) {
                left = 0;
            }
            if(right > arr.length-1) {
                right = arr.length-1;
            }
            for(int i = left; i <= right; i++) {
                if(arr[n] < arr[i]) {
                    n = i;
                }
            }
            sum *= arr[n];
            arr[n] = -51;
            k--;
        }
        System.out.println(sum);
    }
}