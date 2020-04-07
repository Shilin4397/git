package git.minTopk;
import java.io.*;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strs = str.split(" ");
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 0; i < strs.length-1; i++) {
            q.offer(Integer.parseInt(strs[i]));
        }
        int k = Integer.parseInt(strs[strs.length-1]);
        while(k > 1) {
            System.out.print(q.poll()+" ");
            k--;
        }
        System.out.print(q.poll());
    }
}