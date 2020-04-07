package git.deleteNumber;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

//每隔两个数删除一个数
public class Main {

    public static int delete(int[] arr,int n) {
        int i = 0;//循环下标
        int count = 0;//记录删除的个数
        int flag = 0;//删除标记
        while(true) {
            i = i % n;
            if(arr[i] == -1 && count == n) {//最后删除的一个数
                return i;
            }
            while(arr[i%n] == -1 && count != n) {//该数已经被删除，但不是最后一个
                i++;
            }
            if(flag == 2) {
                arr[i%n] = -1;//将被删除的数变为-1
                count++;
                flag = 0;//删除数字后，标记置为0
            }else{
                flag++;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = i;
            }
            System.out.println(delete(array, n));
        }
    }
}
