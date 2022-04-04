package leetcode.editor.en;

// P3_LongestSubstringWithoutRepeatingCharacters

public class P3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        Solution solution = new P3_LongestSubstringWithoutRepeatingCharacters().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * sliding window
         * 原本bf重複走太多地方,其實只要用sliding window就可以
         * 只要s[j]重複了i就往前縮
         * time O(2n) = O(n)
         * space O(k)
         *
         * @param s
         * @return
         */
        public int lengthOfLongestSubstring(String s) {
            int length = s.length();

            int max = 0;
            int[] hashChar = new int[128];
            int left = 0;
            int right = 0;

            while (right < length) {
                //把right字放到sw
                hashChar[s.charAt(right)]++;
                //sw 有重複字
                if (hashChar[s.charAt(right)] > 1) {
                    //sw 有重複字, 去除left的字, left往右移動
                    while (left < length && hashChar[s.charAt(right)] > 1) {
                        hashChar[s.charAt(left)]--;
                        left++;
                    }
                }
                max = Math.max(max, right - left + 1);
                //沒有重複字, sw 往右移動
                right ++;
            }

            return max;
        }


        /**
         * time O(n^3)
         * space O(k)
         * i 從 0 ->length走過一次, j也從i ->length, 尋找對應的substring
         *
         * @param s
         * @return
         */
        public int bf(String s) {
            int max = 0;
            int length = s.length();

            if (length <= 1)
                return length;

            for (int i = 0; i < length; i++) {
                for (int j = i; j < length; j++) {
                    int tmp = subTest(i, j, s);
//                    System.out.println(tmp);
                    max = Math.max(max, subTest(i, j, s));
                }
            }
            return max;
        }

        int subTest(int start, int end, String s) {
            int[] charHashTable = new int[128];
            for (int k = start; k <= end; k++) {
                char tmpChar = s.charAt(k);
//                System.out.print(tmpChar+" ");
                charHashTable[tmpChar]++;
                if (charHashTable[tmpChar] >= 2) {
//                    System.out.print("k="+ k+" ");
                    return k - start;
                }
            }
            return end - start + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}