package git.reOrderArray;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Solution {
    public void reOrderArray(int [] array) {
        int[] arr = new int[array.length];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0) {
                ;
            }else {
                arr[j] = array[i];
                j++;
            }
        }
    }
}
