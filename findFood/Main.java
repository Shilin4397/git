package git.findFood;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {

    public static void findKth(long n) {
                int count = 1;
                if(n == 0) {
                    System.out.println(0);
                    return;
                }
                int temp = 0;
                while(count < 100000) {
                    if(n == 0) {
                        temp = count;
                        break;
                    }
                    n = (8 * (n % 1000000007)) % 1000000007 +7;
                    count++;
                }

                while(count > 1) {
                    count--;
                    n = (n - 7) / 8;
                    if((4 *(n % 1000000007)) % 1000000007 == 0) {
                        temp = count;
                    }
                }
                if(count == 0) {
                    System.out.println(-1);
                    return;
                }
                System.out.println(temp);

//        int k = 4;
//        int count = -1;
//        n = n + 1;
//        for(int i = 2; i < 300000; i++){
//            if((k * n - 1) % 1000000007 == 0){
//                count = i / 3 + ((i % 3) > 0 ? 1 : 0);
//                break;
//            }
//            k = k * 2 % 1000000007;
//        }
//        return count;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()) {
//            long n = in.nextLong();
////            System.out.println(findKth(n));
//            findKth(n);
//        }
        int i = 5;
        int j = (i++)+(++i)+(i--)+(--i);
        System.out.println(j);
    }

}

class Print {
    static boolean out(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (out('A');out('B') && (i < 2);out('C')) {
            i++;
            out('D');
        }
    }
}
