package git.discardTwo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
/*二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
小易想知道最多可以放多少块蛋糕在网格盒子里。*/

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Row = in.nextInt();
        int Col = in.nextInt();
        int[][] array = new int[Row][Col];
        int rowcount = 0;
        int colcount = 0;
        int flag = 1;
        int sum = 0;
        for (int i = 0; i < Row; i++) {
            if(rowcount == 2) {
                rowcount = 0;
                flag *= -1;
            }
            if(Col <= 2) {
                flag = -1;
            }
            if(flag == 1) {
                for (int j = 2; j < Col; j++) {
                    array[i][j] = 1;
                    colcount++;
                    if (colcount == 2) {
                        j += 2;
                        colcount = 0;
                    }
                }
            }else {
                for (int j = 0; j < Col; j++) {
                    array[i][j] = 1;
                    colcount++;
                    if (colcount == 2) {
                        j += 2;
                        colcount = 0;
                    }
                }
            }
            rowcount++;
            if(Col <= 2 && rowcount == 2) {
                i+=2;
            }
        }
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                sum += array[i][j];
            }
        }
        if(Col <= 2) {
            System.out.println(sum);
        }else {
            System.out.println(Row * Col - sum);
        }
    }
}
