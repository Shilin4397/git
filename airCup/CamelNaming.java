package git.airCup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//从C/C++转到Java的程序员，
// 一开始最不习惯的就是变量命名方式的改变
// 。C语言风格使用下划线分隔多个单词，例如“hello_world”；
// 而Java则采用一种叫骆驼命名法的规则：除首个单词以外，
// 所有单词的首字母大写，例如“helloWorld”。
// 请你帮可怜的程序员们自动转换变量名。
public class CamelNaming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] strs = str.split("_");//将_去掉
            for (int i = 1; i < strs.length; i++) {
                String s = strs[i];
                char c = s.charAt(0);//将字符串中的第一个字符取出
                if(c <= 123 && c >= 97) {
                    c -= 32;//将改字符转化为大写
                }
                strs[i] = c + s.substring(1);//将改字符串首字符替换
            }
            String ret = "";
            for (String ss: strs) {
                ret += ss;
            }
            System.out.println(ret);
//            可能会出现异常
//            for (String ss: strs) {
//                System.out.print(ss);
//            }
        }
    }
}
