package git.reverseNum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {

    public static String reverseNum(int n) {
        String str = "";
        while(n > 0) {
            str += n%10;
            n /= 10;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverseNum(n));
    }

}
