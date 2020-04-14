package git.squeOddNum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {

    public static String getSqueOddNum(int n) {
        int mid = n * n;
        int star = 0;
        String str = "";
        if (n % 2 == 0) {
            star = mid + 1 - n;
        } else {
            star = mid - (2 * (n / 2));
        }
        for (int i = 1; i < n; i++) {
            str = str + star + "+";
            star += 2;
        }
        str += star;
        return str;
    }

    public static String getSqueOddNum1(int n) {
        int mid = n * n;
        String str = "";
        int[] array = new int[n];
        int index = 0;
        int k = n / 2;
        if (mid % 2 == 0) {
            mid -= 1;
            for (int i = k - 1; i >= 0; i--) {
                array[index++] = mid - 2 * i;
            }
            for (int j = 1; j <= k; j++) {
                array[index++] = mid + 2 * j;
            }
        } else {
            for (int i = k; i > 0; i--) {
                array[index++] = mid - 2 * i;
            }
            array[index++] = mid;
            for (int j = 1; j <= k; j++) {
                array[index++] = mid + 2 * j;
            }
        }
        for (int i = 0; i < n-1; i++) {
            str = str + array[i] + "+";
        }
        str += array[n-1];
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
//            String str = getSqueOddNum(n);
            String str1 = getSqueOddNum1(n);
//            System.out.println(str);
            System.out.println(str1);
        }
    }
}
