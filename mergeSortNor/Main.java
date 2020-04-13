package git.mergeSortNor;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Main {

    public static void mergeData(int[] array, int left, int mid, int right, int[] temp) {
        int index = left;
        int begin1 = left, end1 = mid, begin2 = mid, end2 = right;
        while(begin1 < end1 && begin2 < end2) {
            if(array[begin1] <= array[begin2]) {
                temp[index++] = array[begin1++];
            }else {
                temp[index++] = array[begin2++];
            }
        }
        while (begin1 < end1) {
            temp[index++] = array[begin1++];
        }
        while (begin2 < end2) {
            temp[index++] = array[begin2++];
        }
    }



    public static void mergeSortNor(int[] array) {
        int[] temp = new int[array.length];
        int gap = 1;

        while (gap < array.length) {
            for (int i = 0; i < array.length; i += gap*2) {
                int left = i;
                int mid = left + gap;
                int right = mid + gap;
                if(mid > array.length) {
                    mid = array.length;
                }
                if(right > array.length) {
                    right = array.length;
                }
                mergeData(array,left,mid,right,temp);
            }
            System.arraycopy(temp,0,array,0,array.length);
            gap <<= 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,6,1,7,9,0,8,5};
        mergeSortNor(arr);

        System.out.println(Arrays.toString(arr));
    }
}
