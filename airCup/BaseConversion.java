package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//十六进驻转换为十进制数
public class BaseConversion {
    public static int fun(int mi) {
        int m = 1;
        if(mi == 0) {
            return m;
        }
        while (mi > 0) {
            m *= 16;
            mi--;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            char[] ch = str.toCharArray();
            int mi = 0;
            int sum = 0;
            for (int i = ch.length-1; i >= 2; i--) {
                int c = (int)ch[i];
                if(c >= 65 && c <= 70) {
                    c -= 55;
                }else {
                    c = ch[i] - '0';
                }
                sum += fun(mi) * c;
                mi++;
            }
            System.out.println(sum);
        }
    }
}
