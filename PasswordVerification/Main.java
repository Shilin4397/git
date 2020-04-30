package git.PasswordVerification;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0;
            if(str.length() <= 8) {
                System.out.println("NG");
            } else {
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if(c < '9' && c > '0') flag1 = 1;
                    else if(c < 'z' && c > 'a') flag2 = 1;
                    else if(c < 'Z' && c > 'A') flag3 = 1;
                    else flag4 = 1;
                }
                boolean bool = com(str);
                flag1 = flag1 + flag2 + flag3 + flag4;
                if(bool == true && flag1 > 2) {
                    System.out.println("OK");
                }else {
                    System.out.println("NG");
                }
            }
        }
    }
    public static boolean com(String str) {
        int len = str.length();
        for (int i = 0; i < len - 3; i++) {
            String str1 = str.substring(i,i+3);
            String str2 = str.substring(i+3,len);
            if(str2.contains(str1)) {
                return false;
            }
        }
        return true;
    }
}
