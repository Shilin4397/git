package sort;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class QuickSort {

    //去基准值的优化
    //从区间最左侧、中间、最右侧去基准值，比较三个数据，返回中间值
    public static int getIndexOfMiddle(int[] array,int left,int right) {
        int mid = left+(right - left)>>1;
        if(array[left] < array[right-1]) {
            if(array[mid] < array[left]) {
                return left;
            }else if(array[mid] > array[left]) {
                return right-1;
            }else {
                return mid;
            }
        }else {
            if(array[mid] > array[left]) {
                return left;
            }else if(array[mid] < array[right-1]) {
                return right-1;
            }else {
                return mid;
            }
        }
    }

    //分割、挖坑法
    public static int Partion2(int[] array,int left,int right) {
        int begin = left;
        int end = right - 1;
        int key = array[end];
        while(begin < end) {
            while(begin < end && array[begin] < key) {
                begin++;
            }
            swap(array,begin,end);
            while (begin < end && array[end] > key) {
                end--;
            }
            swap(array,begin,end);
        }
        return 0;
    }

    //前后索引
    public static int Partion3(int[] array,int left,int right) {
        int cur = left;
        int prev = cur - 1;
        int key = array[right - 1];

        while (cur < right) {
            if(array[cur] < key && ++prev != cur) {
                swap(array,cur,prev);
            }
            ++cur;
            if(++prev != right - 1) {
                swap(array,prev,right - 1);

            }
        }
        return prev;
    }

    //划分
    public static int Partion(int[] array,int left,int right) {
        int begin = left;
        int end = right - 1;
        int key = array[end];
        while(begin < end) {
            //1、left从前往后找比基准值大的元素
            while (begin < end && array[begin] <= key) {
                begin++;
            }
            //2、right从后往前找比基准值
            while (begin < end && array[end] >= key) {
                end--;
            }
            if (begin < end) {
                swap(array, begin, end);
            }
        }
        if(begin != right-1) {
            swap(array, begin, right - 1);
        }
        return begin;
    }

    public static void swap(int[] array,int left,int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    public static void quickSort(int[] arr,int left,int right) {
        if(right - left > 1) {
            int div = Partion(arr,left,right);
            quickSort(arr,left,div);
            quickSort(arr,div+1,right);
        }
    }

    public static void insertsort(int[] array, int left, int right) {

    }

    public static void moreQuickSort(int[] arr,int left,int right) {
        if(right - left < 16) {
            insertsort(arr,left,right);
        }
        else{
            int div = Partion2(arr,left,right);
            quickSort(arr,left,div);
            quickSort(arr,div+1,right);
        }
    }


    public static void quickSortNor(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length);
        stack.push(0);
        while(!stack.empty()) {
            int left = stack.pop();
            int right = stack.pop();
            if(right-left > 1) {
                int div = Partion(array,left,right);
                stack.push(right);
                stack.push(div+1);
                stack.push(div);
                stack.push(left);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,6,1,7,9,0,8,5};
        quickSort(arr,0,arr.length);
//        quickSortNor(arr);
        System.out.println(Arrays.toString(arr));
    }
}
