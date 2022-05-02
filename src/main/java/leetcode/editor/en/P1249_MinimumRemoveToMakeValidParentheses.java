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

        /**
         * 技巧是存入parentheses index 到stack
         * https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
         * @param s
         * @return
         */
        public String minRemoveToMakeValid(String s) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i)))
                    continue;

                if (s.charAt(i) == '(') {
                    //push ( index
                    stack.push(i);
                } else {
                    if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                        //valid pair
                        stack.pop();
                    } else {
                        // 如果沒有valid pair, push ')' index
                        stack.push(i);
                    }
                }
            }

            //如果使用單純的String去處理很大量的字會tle, 改用stringBuilder
            StringBuilder result = new StringBuilder();
            HashSet<Integer> set = new HashSet<>(stack);
            for (int i = 0; i < s.length(); i++)
                if (!set.contains(i))
                    result.append(s.charAt(i));

            return result.toString();


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