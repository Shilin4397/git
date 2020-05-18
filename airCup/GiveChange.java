package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class GiveChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String strs = in.nextLine();
            String[] s = strs.split(" ");
            String[] strs1 = s[0].split("\\.");
            String[] strs2 = s[1].split("\\.");
            int ym = 0;
            int sm = 0;
            ym += Integer.parseInt(strs1[2]);
            ym += Integer.parseInt(strs1[1])*29;
            ym += Integer.parseInt(strs1[0])*29*17;
            sm += Integer.parseInt(strs2[2]);
            sm += Integer.parseInt(strs2[1])*29;
            sm += Integer.parseInt(strs2[0])*29*17;
            int rm = sm - ym;
            if(rm < 0) {
                System.out.print("-");
                rm = -1 * rm;
            }
            int K = rm % 29;
            int S = (rm / 29) % 17;
            int G = (rm / 29) / 17;
            System.out.println(G + "." + S + "." + K);
        }
    }
}
