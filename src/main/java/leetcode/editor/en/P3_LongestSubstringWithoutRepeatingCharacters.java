package leetcode.editor.en;

// P3_LongestSubstringWithoutRepeatingCharacters

public class P3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        Solution solution = new P3_LongestSubstringWithoutRepeatingCharacters().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int max = 0;
            if (s.length() <= 1)
                return s.length();

            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = i + 1; j < s.length() - 1; j++) {
                    int tmp = subTest(i, j, s);
                    System.out.println(tmp);
                    if (tmp > max) {
                        max = tmp;
                    }
                }
            }
            return max;
        }

        int subTest(int i, int j, String s) {
            int[] charHashTable = new int[128];
            for (int k = i; k < j + 1; k++) {
                char tmpChar = s.charAt(k);
                charHashTable[tmpChar]++;
                if (charHashTable[tmpChar] >= 2) {
                    return k - i + 1;
                }
            }
            return j - i + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}