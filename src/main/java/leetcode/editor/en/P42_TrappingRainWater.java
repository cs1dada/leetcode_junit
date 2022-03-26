package leetcode.editor.en;

// P42_TrappingRainWater

public class P42_TrappingRainWater {

    public static void main(String[] args) {

        Solution solution = new P42_TrappingRainWater().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         *  min(maxLeft,maxRight)-height
         * @param height
         * @return
         */
        public int trap(int[] height) {

            int left = 0;
            int right = 0;
            int index = 0;

            int sum = 0;
            for (int i = 0; i < height.length; i++) {
                left = 0;
                right = 0;
                index = i;
                //go left
                while (index > 0) {
                    index--;
                    if (height[index] > left) {
                        left = height[index];
                    }
                }
                //go right
                index = i;
                while (index < height.length - 1) {
                    index++;
                    if (height[index] > right) {
                        right = height[index];
                    }
                }

                int size = Math.min(left, right);
                sum += (size < height[i] ? 0 : size - height[i]);
//                int count = (size < height[i] ? 0 : size - height[i]);
//                System.out.println(sum + "\t" + left + "\t" + right + "\t" + size + "\t" + height[i] + "\t" + count);
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}