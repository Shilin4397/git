package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class PalindromeString {
    //验证字符串是否为回文串
    public static boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            if (ch[left] == ' ' || ch[right] == ' ') {
                left++;
                right--;
                continue;
            }
            if (ch[left] != ch[right]) {
                break;
            }
            left++;
            right--;
        }
        if(right > left) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            int len = str.length();
            boolean bool = false;
            for (int i = 0; i <= len; i++) {//找到添加字符的位置
                String str1 = str.substring(0,i);//截取添加位置前面的代码
                String str2 = str.substring(i,len);//截取添加位置后面的代码
                bool = isPalindrome(str1 + ' ' + str2);//使用空格作为通配符
                if(bool) {
                    break;
                }
            }
            if(bool) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
