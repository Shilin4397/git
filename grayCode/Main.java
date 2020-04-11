package git.grayCode;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */


public class Main {
//在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
//
//给定一个整数n，请返回n位的格雷码，顺序为从0开始。


    public static String[] getGray(int n) {
        // write code here
        if(n == 1) {
            String[] strs = {"0","1"};
            return strs;
        }
        String[] temp = getGray(n-1);
        String[] strs = new String[2*temp.length];
        for(int i = 0; i < temp.length; i++) {
            strs[i] = "0" + temp[i];
        }
        for(int j = 0; j < temp.length; j++) {
            strs[j+temp.length] = "1" + temp[temp.length-j-1];
        }
        return strs;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getGray(2)));
    }
}
