package git.mergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {
    private static void mergeSort(int[] array,int left, int right, int[] temp) {
        if(right - left > 1) {
            int mid = left + ((right - left) >> 1);
            //递归归并左半部分
            mergeSort(array,left,mid,temp);
            //递归归并右半部分
            mergeSort(array,mid,right,temp);
            mergeData(array,left,mid,right,temp);
            System.arraycopy(temp,left,array,left,right - left);
        }
    }

    private static void mergeData(int[] array, int left, int mid, int right, int[] temp) {
        int index = left;
        int begin1 = left, end1 = mid, begin2 = mid, end2 = right;
        while(begin1 < end1 && begin2 < end2) {
            //将小的元素放入temp中
            if(array[begin1] <= array[begin2]) {
                temp[index++] = array[begin1++];
            }else  {
                temp[index++] = array[begin2++];
            }
        }
        //左侧未排完时
        while(begin1 < end1) {
            temp[index++] = array[begin1++];
        }
        //右侧未排完时
        while(begin2 < end2) {
            temp[index++] = array[begin2++];
        }
    }

    public static void mergeSort(int[] array) {
        int[] temp = new int[array.length];
        mergeSort(array,0,array.length,temp);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,8,9,7,0,6,4};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
