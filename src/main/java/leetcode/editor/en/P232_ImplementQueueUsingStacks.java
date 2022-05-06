package leetcode.editor.en;

// P232_ImplementQueueUsingStacks

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P232_ImplementQueueUsingStacks {

    public static void main(String[] args) {

        MyQueue solution = new P232_ImplementQueueUsingStacks().new MyQueue();

    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class MyQueue {
        Stack<Integer> s1;
        Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            //push都推到s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            s1.push(x);
        }

        public int pop() {
            //pop都從s2拿
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.isEmpty() ? null: s2.pop();
        }

        public int peek() {
            //peek都從s2拿
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.isEmpty() ? null: s2.peek();
        }

        public boolean empty() {
            //確認s1 && s2都空才是空
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    class MyQueue_bf {
        List<Integer> stack;

        public MyQueue_bf() {
            stack = new ArrayList<>();
        }

        public void push(int x) {
            stack.add(x);
        }

        public int pop() {
            return stack.remove(0);
        }

        public int peek() {
            return stack.get(0);
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)


}