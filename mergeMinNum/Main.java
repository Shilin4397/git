package git.mergeMinNum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] count = new int[10];
        for (int i = 0; i < 10; i++) {
            count[i] = in.nextInt();
        }
        String str = "";//保存输出结果
        int i = 1;
        //找到第一个非0数字
        for (i = 1; i < 10; i++) {
            if(count[i] != 0) {
                str += i;
                count[i]--;
                break;
            }
        }
        //将0全部放入str
        while (count[0] != 0) {
            str += 0;
            count[0]--;
        }
        //将剩下的数全放入str
        for (int j = i; j < 10; j++) {
            while (count[j] != 0) {
                str += j;
                count[j]--;
            }
        }
        System.out.println(str);
    }

}
