package git.MostAchieve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringTokenizer st;
        while((line = reader.readLine()) != null){
            st = new StringTokenizer(line);
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int[] score = new int[M + 1];
            if((line = reader.readLine()) != null){
                st = new StringTokenizer(line);
                for(int i = 1; i <= M; i++){
                    score[i] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i = 0; i < N; i++){
                if((line = reader.readLine()) != null){
                    st = new StringTokenizer(line);
                    String method = st.nextToken();
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());
                    if(method.equals("Q")){
//                            System.out.println(max(a,b,score));
                        int max = 0;
                        if(a > b) {
                            int tmp = a;
                            a = b;
                            b = tmp;
                        }
                        for (int j = a; j <= b; j++) {
                            if(max < score[j]) {
                                max = score[j];
                            }
                        }
                        System.out.println(max);
                    }else{
                        score[a] = b;
                    }
                }
            }
        }
    }
//        public static int max(int start, int end, int[] students){
//            if(start > end)
//                return max(end,start,students);
//            else{
//                int max = students[start];
//                for(int i = start + 1; i <= end; i++){
//                    if(students[i] > max)
//                        max = students[i];
//                }
//                return max;
//            }
//        }
}
