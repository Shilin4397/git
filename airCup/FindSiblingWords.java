package git.airCup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class FindSiblingWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            String[] ss = line.trim().split(" ");
            if(ss.length < 5) break;
            int n = Integer.parseInt(ss[0]);
            if(n > 1000) break;
            String[] dictionaries = new String[n];
            for (int i = 0; i < n; i++) {
                dictionaries[i] = ss[i+1];
            }
            int m = Integer.parseInt(ss[ss.length-1]);
            String words = ss[n+1];
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                String s2 = dictionaries[j];
                if (!words.equals(s2)) {
                    if (comp(words, s2)) {
                        list.add(s2);
                    }
                }
            }
            Collections.sort(list);
            System.out.println(list.size());
            if(list.size() >= m) {
                System.out.println(list.get(m-1));
            }
        }
    }

    private static boolean comp(String a, String b) {
        int[] aCount = new int[26];
        int[] bCount = new int[26];
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        for(int i = 0; i < ac.length; i++) {
            int index = ac[i] - 97;
            aCount[index]++;
        }
        for(int i = 0; i < bc.length; i++) {
            int index = bc[i] - 97;
            bCount[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if(aCount[i] != bCount[i]) {
                return false;
            }
        }
        return true;
    }
}
