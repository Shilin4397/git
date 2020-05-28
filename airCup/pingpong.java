package git.airCup;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class pingpong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] ss = str.split(" ");
            int[] aCount = new int[26];
            int[] bCount = new int[26];
            char[] ac = ss[0].toCharArray();
            char[] bc = ss[1].toCharArray();
            for(int i = 0; i < ac.length; i++) {
                int index = ac[i] - 65;
                aCount[index]++;
            }
            for(int i = 0; i < bc.length; i++) {
                int index = bc[i] - 65;
                bCount[index]++;
            }
            int flag = 0;
            for(int i = 0; i < 26; i++) {
                if(aCount[i] < bCount[i]) {
                    System.out.println("No");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println("Yes");
            }
        }
    }
}