package git.lastZeroNum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int fun(int n) {
        int count = 0;
        while(n > 0) {
            if(n % 10 == 0) {
                count++;
                n /= 10;
            }else{
                break;
            }
        }
        return count;
    }

//    public static int lastZeroNum(int n) {
//        Stack<Integer> stack = new Stack<>();
//        int count = 0;
//        stack.add(1);
//        for (int i = 1; i <= n; i++) {
//            if(i%2 == 0 && i%5 != 0) {
//                stack.add(i * stack.pop());
//            }else if(i%2 != 0 && i%5 == 0) {
//                int temp = stack.pop();
//                int k = fun(temp * i);
//                count += k;
//                while(k > 0) {
//                    temp /=10;
//                    k--;
//                }
//                stack.add(temp);
//            }else if(i%2 == 0 && i%5 == 0) {
//                count += fun(i);
//            }else {
//                continue;
//            }
//        }
//        return count;
//    }

    public static int lastZeroNum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count=0;
        while(n/5!=0){
            n=n/5;
            count+=n;
        }
        System.out.println(count);
//        System.out.println(lastZeroNum(999));
//        System.out.println(fun(n));
    }
}