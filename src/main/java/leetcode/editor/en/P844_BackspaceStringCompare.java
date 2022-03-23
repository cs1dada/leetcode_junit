package leetcode.editor.en;

// P844_BackspaceStringCompare

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
            int ptr1 = 0;
            int ptr2 = 0;
            int coflictSize = 0;

            for (int i = 0; i < s.length(); i++) {
                ptr1 = i;
                ptr2 = i;


                if (s.charAt(ptr1) == t.charAt(ptr2)) {

                    if (s.charAt(ptr1) == '#' && t.charAt(ptr2) == '#') {
                        coflictSize -= 2;
                    }
                } else if (s.charAt(ptr1) != t.charAt(ptr2)) {
                    if (s.charAt(ptr1) == '#') {
                        //do nothing
                    } else if (t.charAt(ptr2) == '#') {
                        //do nothing
                    } else {
                        coflictSize += 2;
                    }
                }
                System.out.println(s.charAt(ptr1) + "\t" + t.charAt(ptr2) + "\t" + coflictSize);
            }
//            System.out.println(coflictSize);
            return coflictSize == 0 ? true : false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}