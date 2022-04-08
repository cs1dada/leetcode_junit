package leetcode.editor.en;

// P125_ValidPalindrome

public class P125_ValidPalindrome {

    public static void main(String[] args) {

        Solution solution = new P125_ValidPalindrome().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.isEmpty()) {
                return true;
            }
            int head = 0, tail = s.length() - 1;
            char cHead, cTail;
            while(head <= tail) {
                cHead = s.charAt(head);
                cTail = s.charAt(tail);
                if (!Character.isLetterOrDigit(cHead)) {
                    head++;
                } else if(!Character.isLetterOrDigit(cTail)) {
                    tail--;
                } else {
//                    System.out.println(s.charAt(head) + "\t" + s.charAt(tail));
                    if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                        return false;
                    }
                    head++;
                    tail--;
                }
            }

            return true;
        }

        /**
         * time O(n)
         * space O(1)
         * @param s
         * @return
         */
        public boolean isPalindrome_opt(String s) {

            int length = s.length();
            int left = 0;
            int right = length - 1;

            while (left < right) {
                //左跑到真正要比較的字
                while ((!Character.isLetterOrDigit(s.charAt(left)) ) && left < right) {
                    left++;
                }
                //右跑到真正要比較的字
                while ((!Character.isLetterOrDigit(s.charAt(right)) ) && left < right) {
                    right--;
                }

//                System.out.println(s.charAt(left) + "\t" + s.charAt(right));
                //compare 比較左右, 如果一樣繼續往後比
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}