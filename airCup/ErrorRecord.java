package git.airCup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class ErrorRecord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        Map<String, Integer> map = new LinkedHashMap<>();
        while ((str = br.readLine()) != null) {
            String[] strs = str.trim().split(" ");
            String fileName = strs[0].substring(strs[0].lastIndexOf("\\")+1);
            int len = fileName.length();
            if(len > 16) {
                fileName = fileName.substring(len-16);
            }
            String ss = fileName + " " + strs[1];
            if (map.containsKey(ss)) {
                int count = map.get(ss) + 1;
                map.put(ss, count);
            } else {
                map.put(ss, 1);
            }
        }
        int count = 0;
        for (String key:map.keySet()){
            count++;
            if(count > (map.size() -8))
                System.out.println(key + " " + map.get(key));
        }
    }
}
