package git.lastNumCount;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int[] countarray = new int[10];
        for (int i = 0; i < str.length(); i++) {
            countarray[str.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (countarray[i] != 0) {
                System.out.println(i + ":" + countarray[i]);
            }
        }
    }

}