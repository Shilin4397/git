package git.quickFindTopk;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Finder {

    public int findKth(int[] array, int n, int k) {
        return findKth(array,0,n-1,k);
    }

    public int findKth(int[] array,int left,int right, int k) {
        int part = partation(array,left,right);
        if(k == part - left + 1) return array[part];
        else if (k > part - left + 1)return findKth(array,part + 1,right,k - part + left);
        else return findKth(array,left,part - 1, k);
    }

    public int partation(int[] array,int left,int right) {
        int k = array[left];
        while (left < right) {
            while (left < right && array[right] <= k) {
                array[left] = array[right];
            }
            while (left < right && array[left] >= k) {
                array[right] = array[left];
            }
        }
        array [left] = k;
        return left;
    }
}
