package git.BrushMonster;

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

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int[] b = new int[n];
            for(int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            for(int i= 0; i < n; i++) {
                if(a >= b[i]) {
                    a += b[i];
                }else {
                    int p = a;
                    int q = b[i];
                    while (p % q != 0) {
                        int temp = p%q;
                        p = q;
                        q = temp;
                    }
                    a += q;
                }
            }
            System.out.println(a);
        }
    }
}