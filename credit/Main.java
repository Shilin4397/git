package git.credit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] credit = new int[n];
        double[] score = new double[n];
        for (int i = 0; i < n; i++) {
            credit[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int sr = in.nextInt();
            if(sr >=90 && sr <=100) {
                score[i] = 4.0 * credit[i];
            }else if(sr >= 85 && sr <= 89) {
                score[i] = 3.7 * credit[i];
            }else if(sr >= 82 && sr <= 84) {
                score[i] = 3.3 * credit[i];
            }else if(sr >= 78 && sr <= 81) {
                score[i] = 3.0 * credit[i];
            }else if(sr >= 75 && sr <= 77) {
                score[i] = 2.7 * credit[i];
            }else if(sr >= 72 && sr <= 74) {
                score[i] = 2.3 * credit[i];
            }else if(sr >= 68 && sr <= 71) {
                score[i] = 2.0 * credit[i];
            }else if(sr >= 64 && sr <= 67) {
                score[i] = 1.5 * credit[i];
            }else if(sr >= 60 && sr <= 63) {
                score[i] = 1.0 * credit[i];
            }else {
                score[i] = 0;
            }
        }
        float sum1 = 0, sum2 = 0;
        for (int x:credit) {
            sum1 += x;
        }
        for (double d:score) {
            sum2 += d;
        }
        System.out.printf("%.2f",sum2/sum1);
    }
}
