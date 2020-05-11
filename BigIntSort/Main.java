package git.BigIntSort;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {
    private static int compare(String a,String b) {
        if (a.length()>b.length()) {
            return 1;
        }else if (a.length()<b.length()) {
            return -1;
        }else {
            return a.compareTo(b);
        }

    }
    private static void sort(String[] data,int l,int r) {
        if (l<r) {
            int i = l;
            int j = r;
            String x = data[i];
            while(i<j) {
                while(i<j&&compare(data[j], x)>=0) {
                    j--;
                }
                if (i<j) {
                    data[i++] = data[j];
                }
                while(i<j&&compare(data[i], x)<0) {
                    i++;
                }
                if (i<j) {
                    data[j--] = data[i];
                }
            }
            data[i]= x;
            sort(data, l, i-1);
            sort(data, i+1, r);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            int n = Integer.parseInt(s);
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = in.nextLine();
            }
            sort(str, 0,n-1);
            for (String string : str) {
                System.out.println(string);
            }

        }
    }
}
