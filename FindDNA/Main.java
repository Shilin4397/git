package git.FindDNA;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.Scanner;

public class Main {
    public static String findDna(String str, int n) {
        int begin = 0;
        char[] ch = new char[n];//保存当前CG比例最大的序列
        int max = 0;//当前最大序列的CG比例
        for(int i = 0; i <= str.length()-n; i++) {
            int count = 0;//当前序列的CG比例
            char[] temp = new char[n];//保存当前序列
            int index = 0;
            for(int j = i; j < n + i; j++) {//保证每个序列的数量为n
                char c = str.charAt(j);
                if((c == 'C') || (c == 'G')) {
                    count++;
                }
                temp[index++] = c;
            }
            if(max == count) {//遇到CG比例和最大CG比例相同的序列就跳过
                continue;
            }
            if(max < count) {//当前序列比CG比例最大的序列更大时
                System.arraycopy(temp,0,ch,0,n);//用当前序列覆盖最大序列中
                max = count;
            }
        }
        String strs = "";
        for (char c:ch) {
            strs += c;
        }
        return strs;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.next();
            int n = in.nextInt();
            System.out.println(findDna(str,n));
        }
    }
}
