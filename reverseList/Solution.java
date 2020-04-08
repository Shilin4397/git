package git.reverseList;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode newHead = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public static void fun() {
        System.out.println("hh");
    }
    public static void main(String[] args) {
//        int i = 0;
//        Integer j = new Integer(0);
//        System.out.println(j == i);
//        System.out.println(j.equals(i));
//        String s = "sf";
//        s.toUpperCase();
//        System.out.println(s.replace('s','f'));
        ((Solution)null).fun();
    }
}
