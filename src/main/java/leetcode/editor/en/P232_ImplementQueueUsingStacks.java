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
        List<Integer> stack;

        public MyQueue() {
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