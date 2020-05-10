package git.Luckdraw;

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
            float f = 1;
            while (n > 1){
                f = f * ((float)(n-1)/n);
                n -= 1;
            }
            f *= 100;
            System.out.printf("%.2f%%",f);
            System.out.println();
        }
    }
}
