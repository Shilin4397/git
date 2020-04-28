package git.NumberSum;

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
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int sum1 = 0;
            int sum2 = 0;
            int temp = n;
            while (temp > 0) {
                sum1 += (temp % 10);
                temp /= 10;
            }
            temp = n * n;
            while (temp > 0) {
                sum2 += (temp % 10);
                temp /= 10;
            }
            System.out.println(sum1 + " " + sum2);
        }
    }
}
