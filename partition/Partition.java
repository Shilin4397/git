package git.partition;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public static ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode begin1 = null;
        ListNode begin2 = null;
        ListNode end1 = begin1;
        ListNode end2 = begin2;
        while(pHead != null) {
            if(pHead.val < x) {
                if(begin1 == null) {
                    begin1 = pHead;
                    end1 = pHead;
                }else {
                    end1.next = pHead;
                    end1 = end1.next;
                }

            }else {
                if(begin2 == null) {
                    begin2 = pHead;
                    end2 = pHead;
                }else {
                    end2.next = pHead;
                    end2 = end2.next;
                }

            }
            pHead = pHead.next;
        }
        if(begin2 != null) {
            end2.next = null;
        }
        if(begin1 == null) {
            return begin2;
        }
        end1.next = begin2;
        return begin1;
    }

    public static void main(String[] args) {

    }
}
