package git.BuyOrNot;

import java.util.ArrayList;
import java.util.Arrays;

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
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()) {
//            String str1 = in.next();
//            String str2 = in.next();
//            char[] ch1 = str1.toCharArray();
//            char[] ch2 = str2.toCharArray();
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
//            int count = 0;
//            int lack = 0;
//            int exceed = 0;
//            int len1 = ch1.length;
//            int len2 = ch2.length;
//            int i = 0, j = 0;
//            while(i < len1 && j < len2) {
//                while(i < len1 && j < len2 && ch1[i] != ch2[j]) {
//                    i++;
//                }
//                if(i < len1 && j < len2) {
//                    count++;
//                    i++;
//                    j++;
//                }
//            }
//            if(count < len2) {
//                lack = len2 - count;
//                System.out.println("No" + " " + lack);
//            }else {
//                exceed = len1 - count;
//                System.out.println("Yes" + " " + exceed);
//            }

//        }
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int count = 0;
        int exceed = 0;
        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);
        for (int i = 0; i < sb2.length(); i++) {
            int flag = 0;
            for (int j = 0; j < sb1.length(); j++) {
                if(sb2.charAt(i) == sb1.charAt(j)) {
                    count++;
                    flag++;
                    sb1.deleteCharAt(j);
                    break;
                }
            }
            if(flag == 0) {
                exceed++;
            }
        }
        if(count == sb2.length()) {
            System.out.println("Yes" + " " + (sb1.length() - sb2.length()));
        }else {
            System.out.println("No" + " " + exceed);
        }
    }
}
