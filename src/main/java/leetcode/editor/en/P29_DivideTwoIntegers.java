package leetcode.editor.en;

// P29_DivideTwoIntegers

public class P29_DivideTwoIntegers {

    public static void main(String[] args) {

        Solution solution = new P29_DivideTwoIntegers().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int divide(int dividend, int divisor) {


            int dummyDividend = dividend;
            int dummyDivisor = divisor;
            int count = 0;
            boolean isPositive = true;

            if (dummyDividend < 0) {
                isPositive = !isPositive;
                dummyDividend *= -1;
            }

            if (dummyDivisor < 0) {
                isPositive = !isPositive;
                dummyDivisor *= -1;
            }

            while (dummyDividend - dummyDivisor >= 0) {
                count++;
                dummyDividend -= dummyDivisor;
            }

            if (!isPositive) {
                count *= -1;
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}