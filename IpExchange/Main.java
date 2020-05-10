package git.IpExchange;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void getIntNum(String str) {
        String[] strs = str.split("\\.");
        int[] count = new int[32];
        int index = 31;
        for(int i = 3; i >= 0; i--) {
            int temp = Integer.parseInt(strs[i]);
            for(int j = 0; j < 8; j++) {
                count[index] = temp & 1;
                temp = temp >> 1;
                index--;
            }
        }
        long n = 0;
        index = 0;
        for(int i = 31; i >= 0; i--) {
            n = n + count[index++] * mi(i);
        }
        System.out.println(n);
    }

    public static void getIp(String str) {
        long[] count = new long[32];
        Long num = Long.parseLong(str);
        for (int i = 31; i >= 0; i--) {
            count[i] = (num & 1);
            num = num >> 1;
        }
        int index = 0;
        for (int i = 0; i < 4; i++) {
            long[] temp = new long[8];
            for (int j = 0; j < 8; j++) {
                temp[j] = count[index++];
            }
            long n = 0;
            int ind = 0;
            for (int j = 7; j >= 0; j--) {
                n = n + temp[ind++] * mi(j);
            }
            if(i < 3) {
                System.out.print(n + ".");
            }else {
                System.out.println(n);
            }
        }
    }

    public static int mi(int n) {
        int sum = 1;
        for(int i = 1; i <= n; i++) {
            sum *= 2;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null ) {
//            String str = in.nextLine();
//            int flag = str.indexOf('.');
//            int n = 0;
//            String result = "";
//            if (flag != -1) {
//                n = getIntNum(str);
//                System.out.println(n);
//            } else {
//                result += getIp(str);
//                System.out.println(result);
//            }
            getIntNum(str);
            str = br.readLine();
            getIp(str);
        }
    }
}
