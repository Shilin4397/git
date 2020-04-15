package git.UnusualAdd;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {
    public static int UnusualAdd(int A, int B) {
        int temp = A;
        while(B != 0) {
            temp = A ^ B;
            B = (A & B) << 1;
            A = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(UnusualAdd(a,b));
    }
}
