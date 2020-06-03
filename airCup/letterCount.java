package git.airCup;

import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//统计一个字符串中的A-Z
public class letterCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            char[] ch = new char[26];//存储
            for (int i = 0; i < 26; i++) {
                ch[i] = (char)(i+65);
            }
            int[] arr = new int[26];//对应存储A-Z的个数
            char[] chs = str.toCharArray();
            for (char c : chs) {
                if(c >= 'A' && c <= 'Z') {
                    int index = (int)c - 65;
                    arr[index]++;
                }
            }
            for (int i = 0; i < 26; i++) {
                System.out.println(ch[i] + ":" + arr[i]);
            }
        }
    }
}
