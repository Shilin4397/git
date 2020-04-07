package subsets;

import java.util.List;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Subsets {

    public  List<List<Integer>> subsets(int[] nums) {

//        给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;

    }

    public static void main(String[] args) {
        Subsets s = new Subsets();
        int[] arr = {1,2,3};
        s.subsets(arr);
    }
}
