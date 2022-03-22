package leetcode.editor.en;

// P42_TrappingRainWater

public class P42_TrappingRainWater {

    public static void main(String[] args) {

        Solution solution = new P42_TrappingRainWater().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trap(int[] height) {

            int left = 0;
            int leftIndex = 0;
            int right = 0;
            int rightIndex = 0;
            int sum = 0;
            for (int i = 0; i < height.length; i++) {
                int index = i;
                //go left
                while (index > 0) {

                    if (height[index] > left) {
                        left = height[index];
                        leftIndex = index;
                    }
                    index--;
                }
                //go right
                index = i;
                while (index < height.length) {

                    if (height[index] > right) {
                        right = height[index];
                        rightIndex = index;
                    }
                    index++;
                }

                int size = Math.min(left, right);
                sum += size < height[i] ? 0 : size - height[i];
                System.out.println(sum);
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}