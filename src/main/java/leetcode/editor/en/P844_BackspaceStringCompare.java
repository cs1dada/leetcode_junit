package leetcode.editor.en;

// P844_BackspaceStringCompare

import java.util.Stack;

public class P844_BackspaceStringCompare {

    public static void main(String[] args) {

        Solution solution = new P844_BackspaceStringCompare().new Solution();
        //s = "ab#c", t = "ad#c
        //s = "ab##", t = "c#d#"
        //s = "a#c", t = "b"
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            return build(s).equals(build(t));
        }

        /**
         * space O(m+n)
         * time O(m+n)
         * 暴力解法,用Stack存資料(push),遇到#做pop,要特別處理空Stack pop fail
         *
         * @param S
         * @return
         */
        private String build(String S) {
            Stack<Character> stack = new Stack();

            for (char character : S.toCharArray()) {
                if (character == '#') {
                    if (!stack.empty())
                        stack.pop();
                } else {
                    stack.push(character);
                }
            }

            return stack.toString();
        }

        public boolean think1(String s, String t) {
            int ptr1 = 0;
            int ptr2 = 0;
            int coflictSize = 0;

            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();

            for (int i = 0; i < sChar.length; i++) {
                ptr1 = i;
                ptr2 = i;

                if (sChar[ptr1] == tChar[ptr2]) {
                    if (sChar[ptr1] == '#' && tChar[ptr2] == '#') {
                        coflictSize -= 2;
                    }
                } else if (sChar[ptr1] != tChar[ptr2]) {
                    if (sChar[ptr1] == '#') {
                        //do nothing
                    } else if (tChar[ptr2] == '#') {
                        //do nothing
                    } else {
                        coflictSize += 2;
                    }
                }
                System.out.println(sChar[ptr1] + "\t" + tChar[ptr2] + "\t" + coflictSize);
            }

            return coflictSize == 0 ? true : false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}