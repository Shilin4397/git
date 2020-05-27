package git.airCup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class WordInversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String ret = "";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c < 'A' || (c > 'Z' && c < 'a') || c > 'z') {
                    c = ' ';
                }
                ret += c;
            }
            String[] strs = ret.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = strs.length-1; i >= 0; i--) {
                if(!strs[i].equals(" ")) {
                    sb.append(strs[i]);
                }
                if(i > 0) {
                    sb.append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
