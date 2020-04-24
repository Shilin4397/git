package git.doFood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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
        Scanner in = new Scanner(System.in);
        String str;
        String strs = "";
        int i = 1;
//        for (int j = 0; j < 50; j++) {
//            if((str = in.nextLine()) == null) {
//                break;
//            }
//            strs += str;
//        }
        while((str = br.readLine()) != null) {
            if(i != 1) {
                strs += " " + str;
            }else {
                strs += str;
            }
            i = 2;
        }
//        while (in.next() != null) {
//            str += " " + in.nextLine();
//        }

        String[] str1 = strs.split(" ");
        Set<String> set = new HashSet<>();
        for (String s : str1) {
           set.add(s);
        }
        System.out.println(set.size());
    }
}
