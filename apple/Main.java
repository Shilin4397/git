package git.apple;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {

    public static int fun(int n) {
        //count表示所购买的袋数
        int count = n/8;
        //sum表示全部购买8个包装的苹果，剩下的苹果
        int sum = n%8;
        if(sum == 0) {
            return count;
        }else if(sum == 6) {
            return count+1;
        }else {
            count -= 1;
            sum += 8;
            while (sum <= n) {
                if(sum%6 == 0) {
                    count += sum/6;
                    return count;
                }
                count--;
                sum += 8;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));
    }
}
