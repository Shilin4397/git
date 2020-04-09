package git.robotGrid;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {
    static int count = 0;
    public static int countWays(int x, int y) {
        // write code here
        if((x + y) > 12) return 0;
        if(x == 1 || y == 1) return 1;
        //递归走格子，每次走一个格子，每走一个格子，x-1或y-1;
        return count + countWays(x - 1, y) + countWays(x, y-1);
    }
}
