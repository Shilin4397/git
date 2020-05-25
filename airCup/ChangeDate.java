package git.airCup;

import com.sun.javafx.css.PseudoClassState;
import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class ChangeDate {
    public static boolean isLeapYear(int year) {
        if((year%4 == 0) && (year%100 != 0)) {
            return true;
        }
        return false;
    }

    public static int monthDay(int month) {
        switch (month) {
            case 1:
                return 0;
            case 2:
                return 31;
            case 3:
                return 59;
            case 4:
                return 90;
            case 5:
                return 120;
            case 6:
                return 151;
            case 7:
                return 181;
            case 8:
                return 212;
            case 9:
                return 243;
            case 10:
                return 273;
            case 11:
                return 304;
            case 12:
                return 334;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            boolean bool = isLeapYear(year);
            int sumDay = monthDay(month);
            if(sumDay == -1) {
                System.out.println(-1);
            }else if(bool) {
                if(month > 2)
                    sumDay += 1;
                if(sumDay+day > 366) {
                    System.out.println(-1);
                }else {
                    System.out.println(sumDay + day);
                }
            }else {
                if(sumDay+day > 365) {
                    System.out.println(-1);
                }else {
                    System.out.println(sumDay + day);
                }
            }
        }
    }
}
