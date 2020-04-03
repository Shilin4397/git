package git.delete;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SplittableRandom;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {

    public static String deleteString(String str1,String str2) {

        for(int i = 0; i < str2.length(); i++) {
            if(str1 == "") return str1;
            //循环删除str1中的str2.charAt(i)；
            while(str1.indexOf(str2.charAt(i)) != -1) {
                //记录str1中的str2.charAt(i)元素的下标；
                int k = str1.indexOf(str2.charAt(i));
                //删除元素
                str1 = str1.substring(0,k)
                        + str1.substring(k+1,str1.length());
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            //    They are students.
            //            aeiou
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            System.out.println(deleteString(str1,str2));
        }

//        StringBuffer a = new StringBuffer("a");
//        StringBuffer b = new StringBuffer("b");
//        op(a,b);
//        System.out.println(a+" "+ b);
    }
//    static  void op (StringBuffer x , StringBuffer y) {
//        x.append(y);
//        y = x;
//    }
}
