package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class EncryptionString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            encrypt(str1);
            System.out.println();
            System.out.println(unEncrypt(str2));
        }
    }

    private static String unEncrypt(String str2) {
        char[] ch = str2.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] <= 'Z' && ch[i] >= 'A') {
                if(ch[i] > 'A') {
                    ch[i] += 31;
                }else {
                    ch[i] = 'z';
                }
                continue;
            }
            if(ch[i] <= 'z' && ch[i] >= 'a') {
                if(ch[i] > 'a') {
                    ch[i] -= 33;
                }else {
                    ch[i] = 'Z';
                }
                continue;
            }if(ch[i] <= '9' && ch[i] >= '0') {
                int n = ch[i] - '0';
                if(n > 0) {
                    n -= 1;
                    ch[i] = String.valueOf(n).charAt(0);
                }else {
                    ch[i] = '9';
                }
                continue;
            }
        }
        return new String(ch);
    }

    private static void encrypt(String str1) {
        char[] ch = str1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] <= 'Z' && ch[i] >= 'A') {
                if(ch[i] < 'Z') {
                    ch[i] += 33;
                }else {
                    ch[i] = 'a';
                }
                continue;
            }
            if(ch[i] <= 'z' && ch[i] >= 'a') {
                if(ch[i] < 'z') {
                    ch[i] -= 31;
                }else {
                    ch[i] = 'A';
                }
                continue;
            }if(ch[i] <= '9' && ch[i] >= '0') {
                int n = ch[i] - '0';
                if(n < 9) {
                    n += 1;
                    ch[i] = String.valueOf(n).charAt(0);
                }else {
                    ch[i] = '0';
                }
                continue;
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
    }
}
