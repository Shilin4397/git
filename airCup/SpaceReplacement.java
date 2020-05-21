package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class SpaceReplacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuilder str = new StringBuilder(iniString);
        for (int i = 0; i < length; i++) {//遍历字符串
            if(str.charAt(i) == ' ') {
                str.replace(i,i+1,"%20");//将空格替换为%20
            }
        }
        String result = str.toString();
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            SpaceReplacement sr = new SpaceReplacement();
            System.out.println(sr.replaceSpace(str,str.length()));
        }
    }
}
