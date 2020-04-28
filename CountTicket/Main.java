package git.CountTicket;

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
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            String[] name = br.readLine().split(" ");
            int num = Integer.parseInt(br.readLine());
            String[] vote = br.readLine().split(" ");
            int count = 0;
            int Invalid = num;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < num; j++) {
                    if(name[i].equals(vote[j])) {
                        count++;
                    }
                }
                Invalid -= count;
                System.out.println(name[i] + " : " + count);
                count = 0;
            }
            System.out.println("Invalid : " + Invalid);
        }
    }
}
