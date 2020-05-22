package git.airCup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class ArrayPrint {
    public static int[] arrayPrint(int[][] arr, int n) {
        // write code here
        //将二维数组从右上角沿主对角线打印
        //将二维数组从排序成一个一维数组
        int[] array = new int[n*n];
        int index = 0;
        //右上角数据排序
        int i = 0;
        int j = n - 1;
        while (j >= 0) {
            int row = 0;
            int col = j;
            while (row < n && col < n) {
                array[index++] = arr[row][col];
                row++;
                col++;
            }
            j--;
        }
        //左下角排序
        i = 1;
        while (i < n) {
            int row = i;
            int col = 0;
            while (row < n && col < n) {
                array[index++] = arr[row][col];
                row++;
                col++;
            }
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int[] a = arrayPrint(arr, n);
        System.out.println(Arrays.toString(a));
    }
}
