package git.fastestToFibonacci;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

public class Main {

    public static int fib(int n) {
        int f1 = 0;
        int f2 = 1;
        int f3 = f1 + f2;
        if(n == f1 || n == f2) return 0;
        while(true) {
            if(n == f3) {
                return 0;
            }else if(n < f3){
                break;
            }else {
                int temp = f2;
                f3 = f2 + f3;
                f2 = f1 + f2;
                f1 = temp;
            }
        }
        return ((f3-n) > (n - f2)) ? (n - f2) : (f3 - n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
    }

}
