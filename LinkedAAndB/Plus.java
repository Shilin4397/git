package git.LinkedAAndB;

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
public class Plus {
    public static ListNode reverse (ListNode head) {
        ListNode pre = null;
        ListNode newHead = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return newHead;
    }
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a == null || b == null) {
            return null;
        }
        ListNode begin = null;
        ListNode end = null;
        int plus = 0;
        while(a != null || b != null) {
            int temp = plus;
            if(a != null) {
                temp += a.val;
            }
            if(b != null) {
                temp += b.val;
            }
            if(begin == null) {
                end = new ListNode(temp % 10);
                begin = end;
            }else  {
                end.next = new ListNode(temp % 10);
                end = end.next;
            }
            plus = temp / 10;
            if(a == null && b != null) {
                b = b.next;
            }else if(a != null && b == null) {
                a = a.next;
            }else {
                a = a.next;
                b = b.next;
            }
        }
        if(plus == 1) {
            end.next = new ListNode(plus);
        }
        return begin;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        a.next = a1;
        a1.next = a2;

        ListNode b = new ListNode(3);
//        ListNode b1 = new ListNode(2);
//        ListNode b2 = new ListNode(1);
//        b.next = b1;
//        b1.next = b2;

        Plus pl = new Plus();

        ListNode cur =  pl.plusAB(a,b);
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}