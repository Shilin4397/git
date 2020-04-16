package git.ShuffleTheCards;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {

    public static void shuffle(int[] array, int n) {
        int[] temp = new int[2*n];
        int begin1 = 0, end1 = n - 1, begin2 = n, end2 = 2*n - 1;
        int index = 0;
        while (index < 2*n) {
            temp[index++] = array[begin1++];
            temp[index++] = array[begin2++];
        }
        System.arraycopy(temp,0,array,0,2*n);
    }

    public static void shuffleTheCards(int[] array, int k, int n) {
        while(k > 0) {
            shuffle(array,n);
            k--;
        }
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length-1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int sum = in.nextInt();
            for(int i = 0; i < sum; i++) {
                int n = in.nextInt();
                int k = in.nextInt();
                int[] array = new int[2 * n];
                for (int j = 0; j < 2 * n; j++) {
                    array[j] = in.nextInt();
                }
                shuffleTheCards(array,k,n);
                print(array);
            }
        }
    }

}
