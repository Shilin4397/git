package git.maxString;

import sun.util.resources.cldr.te.TimeZoneNames_te;

import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class MaxString {

    public static String maxString(String str) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            String strs = "";
            while(i < str.length() &&  str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                strs += str.charAt(i);
                i++;
            }
            if(strs.length() > 0) list.add(strs);
            i++;

        }
        String maxString = "";
        for(int j = 0;j < list.size();j++) {
            if(list.get(j).length() > maxString.length()) {
                maxString = list.get(j);
            }
        }
        return maxString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String str = sc.next();
            System.out.println(maxString(str));
        }
    }
}
