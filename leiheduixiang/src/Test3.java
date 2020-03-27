import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}//节点类

class MySignalList {
    public ListNode head;

    public MySignalList() {
        this.head = null;
    }
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head==null) {
            this.head=node;
        } else {
            node.next=this.head;
            head=node;
        }
    }
    //尾插法
    public void addLast(int data) {
        ListNode node1 = new ListNode(data);
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node1 = this.head;
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = node;
        }
    }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key) {
            ListNode cur=this.head;
            while(cur!=null) {
                if(cur.data==key) {
                   return true;
                }
                cur=cur.next;
            }
            return false;
        }
        //得到单链表的长度
        public int getLength(){
            ListNode cur=this.head;
            int count=0;
            while(cur!=null) {
                count++;
                cur=cur.next;
            }
            return count;
        }
        private ListNode searchIndex(int index) {
            ListNode cur = this.head;
            //cur -> index-1
            for(int i=1;i<index;i++) {
                cur=cur.next;
            }
            return cur;
        }

        //任意位置插入,第一个数据节点为0号下标
        public boolean addIndex(int index,int data) {
            if (index < 0 | index > getLength()) {
                System.out.println("index不合法！");
                return false;
            }
            if (index == 0) {
                addFirst(data);
                return true;
            }
            ListNode cur = searchIndex(index);
            ListNode node = new ListNode(data);
            node.next = cur.next;
            cur.next = node;
            return true;
            //找到index-1的位置
        }
        public void display() {
            ListNode cur=this.head;
            while(cur!=null) {
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        }


    public static void main(String[] args) {
        MySignalList list=new MySignalList();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(1);
        list.display();
        System.out.println(list.getLength());
        list.addIndex(3,0);
        list.display();
        System.out.println(list.contains(10));
    }

}//单链表

