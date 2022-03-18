package leetcode.editor.en;

// P66_PlusOne

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P66_PlusOne {

    public static void main(String[] args) {

        Solution solution = new P66_PlusOne().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            boolean carry = false;
            int[] carryDigits = new int[digits.length + 1];

            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    carry = true;
                    carryDigits[i + 1] = digits[i];
                } else {
                    digits[i]++;
                    carry = false;
                    carryDigits[i + 1] = digits[i];
                    break;
                }
            }

            if (carry == true) {
                carryDigits[0] = 1;
                return carryDigits;
            }

            return digits;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}