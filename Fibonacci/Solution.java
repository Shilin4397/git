package git.Fibonacci;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Solution {
    //递归求斐波那契数
    public static int Fibonacci(int n) {
//        if(n == 1) {
////            return 1;
////        }
////        if(n == 0) {
////            return 0;
////        }
////
////        return Fibonacci(n-1) + Fibonacci(n-2);

        if(n <= 1) {
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);

    }

    //非递归
    public int func(int n) {
        if(n == 0) {
            return 0;
        }else if (n == 1){
            return 1;
        }
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        for(int i=2;i<=n;i++){
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(4));
    }
}
