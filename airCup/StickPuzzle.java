package git.airCup;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//有一个由很多木棒构成的集合，每个木棒有对应的长度，请问能否用集合中的
// 这些木棒以某个顺序首尾相连构成一个面积大于 0的简单多边形且所有木棒
// 都要用上，简单多边形即不会自交的多边形。初始集合是空的，有两种操作，
// 要么给集合添加一个长度为 L的木棒，要么删去集合中已经有的某个木棒。
// 每次操作结束后你都需要告知是否能用集合中的这些木棒构成一个简单多形。

public class StickPuzzle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] arr1 = new int[n];//存放操作编号
            int[] arr2 = new int[n];//存放木棒长度
            for (int i = 0; i < n; i++) {
                arr1[i] = in.nextInt();
                arr2[i] = in.nextInt();
            }
            ArrayList<Integer> puzzle = new ArrayList<>(); //存放现有木棒
            for (int i = 0; i < n; i++) {

                if(arr1[i] == 1) {
                    puzzle.add(arr2[i]);
                }else {
                    puzzle.remove(new Integer(arr2[i]));
                }
                if(puzzle.size() < 3) {
                    System.out.println("No");
                }else {
                    int sum = 0;//木棒的总长度
                    int max = 0;//最大木棒的长度
                    for (int ret : puzzle) {
                        if(max < ret)
                            max = ret;
                        sum += ret;
                    }
                    if((sum-max) > max) {//最大木棒的长度小于其他木棒的总长度时，可以构成多边行
                        System.out.println("Yes");
                    }else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
