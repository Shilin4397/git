package git.findFood;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {

    public static int findKth(long n) {
        int k = 4;
        int count = -1;
        n = n + 1;
        for(int i = 2; i < 300000; i++){
            if((k * n - 1) % 1000000007 == 0){
                count = i / 3 + ((i % 3) > 0 ? 1 : 0);
                break;
            }
            k = k * 2 % 1000000007;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            long n = in.nextLong();
            System.out.println(findKth(n));
        }
    }

}
