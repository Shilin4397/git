package git.exchangeNum;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {
    public static int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] ^ AB[1];//AB[0] = 2 ^ 4 = 6;
        AB[1] = AB[0] ^ AB[1];//AB[1] = 6 ^ 4 = 2;
        AB[0] = AB[0] ^ AB[1];//AB[0] = 6 ^ 2 = 4;
        return AB;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(exchangeAB(new int[] {2,4})));
    }
}
