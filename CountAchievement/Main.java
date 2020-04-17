package git.CountAchievement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(in.hasNext()) {
            int n = in.nextInt();
            if(n == 0) {
                break;
            }
            int count = 0;
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int s = in.nextInt();
            for (int i = 0; i < n; i++) {
                if (s == array[i]) {
                    count++;
                }
            }
            list.add(count);
        }
        if(list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }

}