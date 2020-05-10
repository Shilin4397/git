package git.method;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=scanner.nextInt();
        int a[]=new int[n];
        long value[]=new long[sum+1];
        value[0]=1;
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
            for(int j=sum;j-a[i]>=0;j--){
                value[j]=value[j-a[i]]+value[j];
            }
        }
        System.out.println(value[sum]);
    }
}