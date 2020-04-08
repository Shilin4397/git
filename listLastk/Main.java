package git.listLastk;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

class Node{
    Node next = null;
    int val;
    public Node(int val) {
        this.val = val;
    }
}

public class Main {

    //方法一
    public  Node FindKthToTail(Node node,int k) {
        if(k <= 0 ||node == null) {
            return null;
        }
        Node left = node;
        Node right = node;
        while(k > 1 && right.next != null) {
            right = right.next;
            k--;
        }
        if(k > 1) {
            return null;
        }
        while(right.next != null) {
            left = left.next;
            right = right.next;
        }
        return left;
    }
    //方法二
    public Node FindKthToTailII(Node head,int k) {
        if(k<=0||head==null) {
            return null;
        }
        Node fast=head;
        Node slow=head;
        while(k-1>0) {
            if(fast.next!=null) {
                fast=fast.next;
                k--;
            }else {
                System.out.println("输入位置不合法！");
                return null;
            }
        }
        while(fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;

    }

    public static void main(String[] args) {

    }
}
