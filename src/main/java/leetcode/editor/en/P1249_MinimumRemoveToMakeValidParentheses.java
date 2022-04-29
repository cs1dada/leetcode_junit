package leetcode.editor.en;

// P1249_MinimumRemoveToMakeValidParentheses

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class P1249_MinimumRemoveToMakeValidParentheses {

    public static void main(String[] args) {

        Solution solution = new P1249_MinimumRemoveToMakeValidParentheses().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public String minRemoveToMakeValid(String s) {

            Stack<Integer> stack = new Stack<>();
            String validStr = "";
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i)))
                    continue;

                if (s.charAt(i) == '(') {
                    //push ( index
                    stack.push(i);
                } else if (s.charAt(i) == ')') {
                    if (!stack.empty() && s.charAt(stack.peek()) == '(') {
                        //valid pair
                        stack.pop();
                    } else {
                        // () => "", stack.empty(), )不存入stack
                        stack.push(i);
                    }
                }
            }


            //stack != empty, 去除所有 ( , invalidParenthesesIndex
            HashSet<Integer> invalidP = new HashSet<>(stack);
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    validStr += s.charAt(i);
                } else {
                    //合法 parentheses
                    if (!invalidP.contains(i)) {
                        validStr += s.charAt(i);
                    }
                }

            }
            
            System.out.println(validStr);
            return validStr;

        }

        public String minRemoveToMakeValid_bf(String s) {

            Stack<Character> stack = new Stack<>();
            String validStr = "";
            for (int i = 0; i < s.length(); i++) {
                //(
                if (s.charAt(i) == '(') {
                    stack.push(')');
                    //append to validStr
                    validStr += '(';
                }//)
                else if (s.charAt(i) == ')') {
                    if (!stack.empty() && stack.peek() == s.charAt(i)) {
                        //ok
                        stack.pop();
                        //append to validStr
                        validStr += ')';
                    } else {
                        //stack.empty(), remove cur(')') from s (not append to validStr)

                    }
                } // normal char
                else {
                    //append to validStr
                    validStr += s.charAt(i);
                }

            }

            //stack != empty, 去除所有 ()
            if (!stack.empty()) {
                String temp = "";
                for (int i = 0; i < validStr.length(); i++) {
                    if (validStr.charAt(i) != '(' && validStr.charAt(i) != ')') {
                        temp += validStr.charAt(i);
                    }
                }
                validStr = temp;
            }

            return validStr;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}