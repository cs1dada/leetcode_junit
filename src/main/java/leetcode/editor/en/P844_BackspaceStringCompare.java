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

        /**
         * 雙指標法
         * 從後面往前走, 如果遇到#之後的字要忽略掉
         * 直到確定這個字, 是最後留下的字
         * 比較s和t
         *
         * @param s
         * @param t
         * @return
         */
        public boolean backspaceCompare(String s, String t) {
            int sPtr = s.length() - 1;
            int tPtr = t.length() - 1;
            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();
            int sIgnore = 0;
            int tIgnore = 0;


            while (sPtr > 0 && tPtr > 0) {
                //s
                while (sPtr >= 0) {
                    if (sChar[sPtr] == '#') {
                        //此字元是#
                        sIgnore++;
                        sPtr--;
                    } else if (sIgnore > 0) {
                        //此字元被#抵銷
                        sIgnore--;
                        sPtr--;
                    } else {
                        //sIgnore == 0 && sChar[sPtr] != '#'
                        //此字元是會留下的字元
                        break;
                    }
                }

                //p
                while (tPtr >= 0) {
                    if (tChar[tPtr] == '#') {
                        //此字元是#
                        tIgnore++;
                        tPtr--;
                    } else if (tIgnore > 0) {
                        //此字元被#抵銷
                        tIgnore--;
                        tPtr--;
                    } else {
                        //sIgnore == 0 && sChar[sPtr] != '#'
                        //此字元是會留下的字元
                        break;
                    }
                }

                if (sPtr < 0 && tPtr < 0) {
                    break;
                }
                if (sChar[sPtr] != tChar[tPtr]) {
                    System.out.print(sChar[sPtr] + " xxxx " + tChar[tPtr]);
                    return false;
                } else {
                    System.out.print(sChar[sPtr] + " ");
                }
                sPtr--;
                tPtr--;
            }
            return true;
        }

        public boolean BF(String s, String t) {
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