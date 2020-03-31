package git;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class prenthesis {
    public static boolean chkParenthesis(String A, int n) {
        Stack<Character> s = new Stack<>();
        for(int i = 0;i < n;i++) {
            char ch = A.charAt(i);
            if(ch == '(') {
                s.add(ch);
            }else if(ch == ')') {
                if(s.empty()) {
                    return false;
                }
                s.pop();
            }else {
                return false;
            }
        }
        if(!s.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(chkParenthesis(str,str.length()));
    }
}
