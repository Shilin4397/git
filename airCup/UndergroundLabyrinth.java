package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//地下迷宫
public class UndergroundLabyrinth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int p = in.nextInt(); //能量值
            int[][] la = new int[n][m]; //迷宫
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    la[i][j] = in.nextInt();
                }
            }
            
        }
    }
}
