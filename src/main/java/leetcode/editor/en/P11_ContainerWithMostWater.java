package leetcode.editor.en;

// P11_ContainerWithMostWater

public class P11_ContainerWithMostWater {

    public static void main(String[] args) {

        Solution solution = new P11_ContainerWithMostWater().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 上次twosum那招, 利用space來改善time....沒用了.
         *
         * 改思考這個公式可以怎麼改進
         * min(a,b)*(bi-ai)
         *
         * bi-ai要最大 => a,b在頭尾
         * min(a,b) 要最大 => 小的ptr才會影響, 所以只要移動小的ptr
         * @param height
         * @return
         */
        public int maxArea(int[] height) {
            if (height.length <= 1)
                return 0;

            int maxArea = 0;
            int left = 0;
            int right = height.length - 1;

            while (left < right) {
                int temp = Math.min(height[left], height[right]) * (right - left);
                if (temp > maxArea) {
                    maxArea = temp;
                }
                //寬:短邊移動
                if (height[left] > height[right]) {
                    right--;
                } else {
                    left++;
                }
            }

            return maxArea;
        }

        /**
         *
         * time O(n^2)
         * space O(1)
         * time >>> space => 利用space來改善time ?
         */
        public int bruteForce(int[] height) {
            if (height.length <= 1)
                return 0;

            int maxArea = 0;
            for (int i = 0; i < height.length; i++) {
                for (int j = i + 1; j < height.length; j++) {
                    int temp = Math.min(height[i], height[j]) * (j - i);
                    if (temp > maxArea) {
                        maxArea = temp;
                    }
                }

            }

            return maxArea;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}