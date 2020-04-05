package git.candyQuantity;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++) {
            arr[i] = scan.nextInt();
        }

        int A = (arr[0] + arr[2]) >> 1;
        int B = (arr[1] + arr[3]) >> 1;
        int C = arr[3] - B;
        if(((arr[0] + arr[2])%2) != 0 || ((arr[1]+arr[3])%2) != 0) {
            System.out.println("No");
            return;
        }
        if(A >= 0 && B >= 0 && C >= 0) {
            System.out.println(A + " " + B + " " + C);
        }else {
            System.out.println("No");
        }
    }
}
