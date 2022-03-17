package leetcode.editor.en;

// P29_DivideTwoIntegers

public class P29_DivideTwoIntegers {

    public static void main(String[] args) {

        Solution solution = new P29_DivideTwoIntegers().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int divide(int dividend, int divisor) {
            int dummyDividend = Math.abs(dividend);
            int dummyDivisor = Math.abs(divisor);
            int quotient = 0;
            int lShift = 0;
            boolean isPositive = true;
            //edge case
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }

            //判斷正負號
            if (dividend < 0) {
                isPositive = !isPositive;
            }

            if (divisor < 0) {
                isPositive = !isPositive;
            }

            //減法計算商
            while (dummyDividend - dummyDivisor >= 0) {
                /**
                 *  讓商指數成長 => 2^x
                 *  116>3*2^0 = 3 << 0 =3
                 *  116>3*2^1 = 3 << 1 =6
                 *  116>3*2^2 = 3 << 2 =12
                 *  116>3*2^3 = 3 << 3 =24
                 *  ....
                 *  116>3*2^5 = 3 << 5 =96
                 *  116>3*2^5 = 3*32 = 96 => 100-96 => rem 20
                 *  repeat....
                 *  20>3*2^0 = 3
                 *  20>3*2^1 = 6
                 */
                for (lShift = 0; dummyDividend - (dummyDivisor << lShift << 1) >= 0; lShift++) ;
                //餘數保留到下一輪繼續除
                dummyDividend -= dummyDivisor << lShift;
                //商數累加
                quotient += 1 << lShift;

            }

            if (!isPositive) {
                quotient = -quotient;
            }

            return quotient;
        }

        /**
         * 不能用除法所以改用減法
         * 100/3=33...1
         * 100 - 3 重複做, 直到不能-3, 總共做了33次 => 商:33
         * <p>
         * 會tle...每次減一個除數太慢, 要想辦法加速...想辦法一次減多個除數
         * <p>
         * time  O(n/k) = O(n)
         * space O(1)
         *
         * @param dividend
         * @param divisor
         * @return
         */
        public int bruteForce(int dividend, int divisor) {
            int dummyDividend = Math.abs(dividend);
            int dummyDivisor = Math.abs(divisor);
            int count = 0;
            boolean isPositive = true;

            //edge case
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }

            //判斷正負號
            if (dividend < 0) {
                isPositive = !isPositive;
            }

            if (divisor < 0) {
                isPositive = !isPositive;
            }

            //減法計算商
            while (dummyDividend - dummyDivisor >= 0) {
                count++;
                dummyDividend -= dummyDivisor;
            }

            if (!isPositive) {
                count = -count;
            }

            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}