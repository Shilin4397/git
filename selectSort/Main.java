package git.selectSort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//1、找到最大元素
//2、最大元素和最后一个元素交换位置
//3、继续在前面的元素中找最大元素
public class Main {
    public static void selectSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int max = 0;//记录最大元素的下标
            for (int i = 1; i < array.length-j; i++) {//依次和后面的元素进行比较
                if(array[i] > array[max]) {
                    max = i;//将更大的元素的下标赋给max
                }
            }
            if(array.length - j != max) {//最大元素不是最后一个元素时
                swap(array,max,array.length-j-1);//将最大元素和最后一个元素位置交换
            }
        }
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] array = {3,8,2,6,5,7,1,4,0,9};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
