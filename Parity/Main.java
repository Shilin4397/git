package git.Parity;

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
        while (in.hasNextLine()) {
            String s = in.nextLine();
            for (int i = 0; i < s.length(); i++) {
                int n = s.charAt(i);
                int count = 0;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < 7; j++) {
                    if((n & 1) == 1) {
                        sb.append(1);
                        count++;
                    }else {
                        sb.append(0);
                    }
                    n >>= 1;
                }
                if((count % 2) == 0) {
                    sb.append(1);
                }else {
                    sb.append(0);
                }
                sb.reverse();
                System.out.println(sb);
            }
        }
    }
}
