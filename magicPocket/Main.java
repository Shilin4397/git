package git.magicPocket;

import com.sun.jmx.snmp.internal.SnmpSecurityCache;

import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        while(sc.hasNext()) {
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            int[] c = new int[41];
            //0号下标元素表示有一种成功的方法
            //将40减去array数组中的对应元素值放在c数组中下标等于array数组中对应元素值，的位置
            //利用循环让40不断减去这些值，并将减去的这些值的和存放在array数组中
            // 直到某一次40减去这个和等于0时，及j-array[i]==0时将c[0]加给c[40]
            //c[40]中保存的是成功的方法的总数；
            c[0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 40; j >= array[i]; j--) {
                    c[j] += c[j - array[i]];
                }
            }
            System.out.println(c[40]);


        }
    }

}
