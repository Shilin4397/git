package git.airCup;

import jdk.nashorn.internal.runtime.ECMAException;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class airCup {
    public static int fun(int n) {

        if(n < 3) {
            if(n == 2) {
                return 1;
            }else {
                return 0;
            }
        }
        int tmp = n/3;
        return tmp+fun(tmp+(n%3));
    }

    public static int func(int n) {
        int sum = 0;
        while(n > 2) {
            int tmp = n/3;
            sum += tmp;
            n = tmp + n%3;
        }
        if(n == 2) {
            sum += 1;
        }
        return sum;
    }

    static int getBottle(int empty, int full) {
        if (empty < 3) {
            if (empty == 2) {
                return full+1;
            } else {
                return full;
            }
        }
        int tempFull = empty/3;
        int tempEmpty = empty%3 + tempFull;
        return getBottle(tempEmpty, full + tempFull);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(in.hasNextLine()) {

            int n = in.nextInt();
            if(n == 0) {
                break;
            }
            list.add(func(n));
//            list.add(getBottle(n,0));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        in.close();
    }
}

