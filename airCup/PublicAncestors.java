package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class PublicAncestors {
    public static int getLCA(int a, int b) {
        // write code here
        int cur = 0;
        while (a >= 1 && b >= 1) {
            int left = a;
            int right = b;
            if(a > b) {
                left = b;
                right = a;
            }
            int lp = 0;
            int rp = 0;
            if(left % 2 == 0) {
                lp = left / 2;
            }else {
                lp = (left - 1) /2;
            }
            if(right % 2 == 0) {
                rp = right / 2;
            }else {
                rp = right / 2;
            }
            if(rp == left || rp == lp) {
                cur = rp;
                break;
            }
            b = rp;
            if(a > b) {
                a = lp;
            }
        }
        if(cur != 0)
            return cur;
        else
            return cur;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] strs = str.split("\\,");
            int node1 = Integer.parseInt(strs[0]);
            int node2 = Integer.parseInt(strs[1]);
            int cur = getLCA(node1,node2);
            System.out.println(cur);
        }
    }
}
