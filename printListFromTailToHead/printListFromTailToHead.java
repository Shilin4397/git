package git.printListFromTailToHead;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
class ListNode{
    int val;
    ListNode next = null;
    public ListNode(int data) {
        this.val = data;
    }
}
public class printListFromTailToHead {
    public ArrayList<Integer> func(ListNode listNode) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = listNode;
        while(cur != null) {
            s.push(cur.val);
            cur = cur.next;
        }
        while(!s.empty()) {
            int tmp = s.pop();
            list.add(tmp);
        }
        return list;
    }
}
