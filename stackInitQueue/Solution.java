package git.stackInitQueue;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        while(!stack1.empty()) {
            stack2.add(stack1.pop());
        }
        int tmp = stack2.pop();
        while(!stack2.empty()) {
            stack1.add(stack2.pop());
        }
        return tmp;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("hh");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
    }
}
