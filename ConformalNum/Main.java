package git.ConformalNum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            long l = n * n;
            int count = 1;
            int ret = n;
            while (ret > 0) {
                ret /= 10;
                count++;
            }
            int tmp = 1;
            while (count > 1) {
                tmp *= 10;
                count--;
            }
            if((l % tmp) == n) {
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
}