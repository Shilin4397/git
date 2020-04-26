package git.NumClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            int x = in.nextInt();
            int[] array = new int[x];
            for (int i = 0; i < x; i++) {
                array[i] = in.nextInt();
            }
            int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0;
            int a = 1, count = 0;
            int f1 = 0;
            for (int n : array) {
                if ((n % 5 == 0) && (n % 2 == 0)) {
                    A1 += n;
                    f1 = 1;
                }else if (n % 5 == 1) {
                    A2 = A2 + a * n;
                    a *= -1;
                }else if (n % 5 == 2) {
                    A3++;
                }else if (n % 5 == 3) {
                    A4 += n;
                    count++;
                }else {
                    if (n > A5) {
                        A5 = n;
                    }
                }
            }
            String[] s = new String[5];
            if(f1 == 0) {
                s[0] = "N";
            }else {
                s[0] = "" + A1;
            }
            if(A2 == 0) {
                s[1] = "N";
            }else {
                s[1] = "" + A2;
            }
            if(A3 == 0) {
                s[2] = "N";
            }else {
                s[2] = "" + A3;
            }
            if(A4 == 0) {
                s[3] = "N";
            }else {
                s[3] = "" + A4;
            }
            if(A5 == 0) {
                s[4] = "N";
            }else {
                s[4] = "" + A5;
            }
            for (int i = 0; i < 3; i++) {
                System.out.print(s[i] + " ");
            }
            System.out.printf("%.1f",(Double.parseDouble(s[3])) / count);
            System.out.println(" " + s[4]);
        }
    }
}
