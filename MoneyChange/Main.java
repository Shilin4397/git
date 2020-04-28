package git.MoneyChange;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.ArrayList;;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        String numtable = "零壹贰叁肆伍陆柒捌玖";
        while ((str = br.readLine()) != null) {
            String[] money = str.split("\\.");
            StringBuilder sb = new StringBuilder("人民币");
            int beforemoney = Integer.parseInt(money[0]);
            if(beforemoney != 0) {
                sb.append(RMBChange(beforemoney));
            }

            int aftermoney = Integer.parseInt(money[1]);
            if(aftermoney > 0) {
                if(aftermoney >= 10) {
                    sb.append(numtable.charAt(aftermoney / 10) + "角");
                }
                if(aftermoney % 10 != 0) {
                    sb.append(numtable.charAt(aftermoney % 10) + "分");
                }
            }else {
                sb.append("整");
            }
            System.out.println(sb);
        }
    }

    public static String RMBChange(int money) {
        String unitable = "元万亿";
        String str = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (money >= 10000) {
            list.add(money%10000);
            money /= 10000;
        }
        list.add(money);
        for(int i = list.size() - 1; i >= 0; i--) {
            str += (changeNum(list.get(i)) + unitable.charAt(i));
        }
        return str;
    }

    public static String changeNum(int n) {
        String numtable = "零壹贰叁肆伍陆柒捌玖";
        String str = "";
        if(n >= 1000) {
            str += (numtable.charAt(n/1000) + "仟");
            n %= 1000;
            if(n < 100 && n != 0) {
                str += numtable.charAt(0);
            }
        }
        if(n >= 100) {
            str += (numtable.charAt(n/100) + "佰");
            n %= 100;
            if(n < 10 && n != 0) {
                str += numtable.charAt(0);
            }
        }
        if(n >= 10) {
            if(n >= 10 && n < 20) {
                str += "拾";
            }else {
                str += numtable.charAt(n/10) + "拾";
            }
            n %= 10;
        }
        if(n != 0) {
            str += numtable.charAt(n);
        }
        return str;
    }
}