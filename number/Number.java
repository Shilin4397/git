package git.number;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Number {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strs = str.split(" ");
        int count = 0;
        int len = strs.length/2;
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums.length; i++) {
            if(stack.isEmpty()) {
                stack.push(nums[i]);
            }else if(nums[i] != stack.peek()) {
                stack.pop();
            }else {
                stack.push(nums[i]);
            }
        }
        if(!stack.isEmpty()) {
            System.out.println(stack.peek());
        }
    }
}
