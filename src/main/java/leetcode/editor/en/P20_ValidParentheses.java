package leetcode.editor.en;

// P20_ValidParentheses

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P20_ValidParentheses {

    public static void main(String[] args) {

        Solution solution = new P20_ValidParentheses().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //'(', ')', '{', '}', '[' and ']'
        //"()[]{}"
        //"()[]{[()()]}"
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char cur : s.toCharArray()) {
                //左括號push
                if (cur == '(') {
                    stack.push(')');
                } else if (cur == '{') {
                    stack.push('}');
                } else if (cur == '[') {
                    stack.push(']');
                } else {
                    //stack peek比較 == 右掛號,如果Stack為空直接false
                    if (!stack.empty() && cur == stack.peek()) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

            return stack.empty() ? true : false;
        }

        public boolean isValid_bf(String s) {
            int l = s.length();
            int stackTop = 0;
            List<String> stack = new ArrayList<>();
            for (int i = 0; i < l; i++) {
                char cur = s.charAt(i);
                if (cur == '(' || cur == '{' || cur == '[') {
                    stack.add(Character.toString(cur));
                    stackTop++;
                } else {
                    if (stackTop < 1) {
                        return false;
                    }
                    if ((cur == ')' && stack.get(stackTop - 1).charAt(0) == '(')
                            || (cur == '}' && stack.get(stackTop - 1).charAt(0) == '{')
                            || (cur == ']' && stack.get(stackTop - 1).charAt(0) == '[')) {
                        stack.remove(stackTop - 1);
                        stackTop--;
                    } else {
                        return false;
                    }
                }
            }

            return stackTop > 0 ? false : true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}