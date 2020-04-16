package git.longNumAdd;

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
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        while ((str1 = br.readLine()) != null) {
            String str2 = br.readLine();
            StringBuilder s1 = new StringBuilder(str1);
            StringBuilder s2 = new StringBuilder(str2);
            int len1 = s1.length();
            int len2 = s2.length();
            if(len1 < len2) {
                for(int i = 0; i < len2 - len1; i++) {
                    s1.insert(0,'0');
                }
            }else {
                for (int i = 0; i < len1 - len2; i++) {
                    s2.insert(0,'0');
                }
            }
            StringBuilder s = new StringBuilder();
            int temp = 0;
            for(int i = s1.length()-1; i >= 0; i--) {
                int n = s1.charAt(i)-'0';
                int m = s2.charAt(i)-'0';
                int sum = n + m + temp;
                s.insert(0,sum%10);
                temp = sum/10;
            }
            if(temp != 0) {
                s.insert(0,temp);
            }
            System.out.println(s);
        }
    }
}
class Fun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String s1 = in.next();
            String s2 = in.next();
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}
