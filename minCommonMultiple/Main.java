package git.minCommonMultiple;

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
        int a = in.nextInt();
        int b = in.nextInt();
        int max = a;
        if(a < b) {
            max = b;
        }
        while(true) {
            if((max % a == 0) && (max % b == 0)) {
                break;
            }
            max++;
        }
        System.out.println(max);
    }
}
