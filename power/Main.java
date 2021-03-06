package git.power;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//给定一个double类型的浮点数base和int类型的整数exponent。
// 求base的exponent次方。
public class Main {

        public double Power(double base, int exponent) {
            if(base == 0 && exponent == 0) return 0;
            double sum = 1.0;
            if(exponent == 0) {
              return sum;
            } else if(exponent > 0) {
                while (exponent > 0) {
                    sum *= base;
                    exponent--;
                }
            } else{
                exponent *= -1;
                while (exponent > 0) {
                    sum *= base;
                    exponent--;
                }
                sum = 1.0/sum;
            }
            return sum;
        }
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double base = in.nextDouble();
            int exponent = in.nextInt();
            Main s = new Main();
        System.out.println(s.Power(base,exponent));


    }

}

/*
*import java.io.*;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strs = str.split(" ");
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 0; i < strs.length-1; i++) {
            q.offer(Integer.parseInt(strs[i]));
        }
        int k = Integer.parseInt(strs[strs.length-1]);
        while(k > 1) {
            System.out.print(q.poll()+" ");
            k--;
        }
        System.out.print(q.poll());
    }
}
* */
