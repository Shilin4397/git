package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class CountTwo {
    public int countNumberOf2s(int n) {
        // write code here
        int sum = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;
            int ret = (a%10 == 2) ? (b + 1) : 0;
            sum += (a + 7) / 10 * i + ret;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        CountTwo c = new CountTwo();
        System.out.println(c.countNumberOf2s(n));
    }
}
