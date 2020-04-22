package git.rabbitCount;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {
    public static int rabbitCount(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i=2;i<n;++i)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int sum = rabbitCount(n);
            System.out.println(sum);
        }
    }
}
