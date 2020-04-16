package git.learnAoBaMa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strs = str.split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = (n+1) / 2;
        char ch = strs[1].charAt(0);
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
        m -= 1;
        if(m > 1) {
            System.out.println();
        }
        while(m > 1) {
            System.out.print(ch);
            for (int i = 1; i < n - 1; i++) {
                System.out.print(" ");
            }
            System.out.print(ch);
            System.out.println();
            m--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }
}

class Anwser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();//输出的列数
        String c=in.next();//输出的字符
        for(int i=1;i<=N;i++){//输出第一行
            System.out.print(c);
        }
        System.out.println();//第一行换行
        for(int i=1;i<=Math.ceil((double)N/2)-2;i++){//输出中间行
            System.out.print(c);//中间行第一个字符
            for(int j=2;j<=N-1;j++){
                System.out.print(" ");//中间行其它字符为空字符串
            }
            System.out.println(c);//中间行最后一个字符
        }
        for(int i=1;i<=N;i++){// 输出最后一行
            System.out.print(c);
        }
    }
}