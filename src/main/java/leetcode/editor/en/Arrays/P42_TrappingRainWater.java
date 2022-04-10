package leetcode.editor.en.Arrays;

// P42_TrappingRainWater

public class P42_TrappingRainWater {

    public static void main(String[] args) {

        Solution solution = new P42_TrappingRainWater().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        /**
         * time O(n)
         * space O(1)
         * 雙指針做法
         *
         * we can say that if there is a larger bar at one end (say right),
         * we are assured that the water trapped would be dependant on height of bar
         * in current direction (from left to right).
         * As soon as we find the bar at other end (right) is smaller,
         * we start iterating in opposite direction (from right to left).
         *
         * 1 想辦法一回合就更新 maxLeftArr/maxRightArr => 做不到
         * 2 雙指針做法=>每次先判斷左右指針誰比較高 => 水會卡在低的那邊
         * 3 再判斷指針和leftMax/rightMax誰比較高
         * min(maxLeft,maxRight)-height
         *
         * @param height
         * @return
         */
        public int trap(int[] height) {

            int lPtr = 0;
            int rPtr = height.length - 1;
            int leftMax = 0;
            int rightMax = 0;
            int sum = 0;

            while (lPtr < rPtr) {
                //left 比較低
                if (height[lPtr] < height[rPtr]) {
                    if (height[lPtr] > leftMax) {
                        leftMax = height[lPtr];
                    } else {
                        sum += leftMax - height[lPtr];
                    }
                    ++lPtr;
                }//right 比較低
                else {
                    if (height[rPtr] > rightMax) {
                        rightMax = height[rPtr];
                    } else {
                        sum += rightMax - height[rPtr];
                    }
                    --rPtr;
                }
            }

            return sum;

        }

        /**
         * time O(n)
         * space O(n)
         * min(maxLeft,maxRight)-height
         *
         * @param height
         * @return
         */
        public int trapByArray(int[] height) {

            int[] maxLeftArr = new int[height.length];
            int[] maxRightArr = new int[height.length];
            int leftMax = 0;
            int rightMax = 0;
            int sum = 0;
            //把 maxLeftArr 求出
            for (int i = 0; i < height.length; i++) {
                if (height[i] > leftMax) {
                    leftMax = height[i];
                }
                maxLeftArr[i] = leftMax;
            }
            //把 maxRightArr 求出
            for (int i = height.length - 1; i >= 0; i--) {
                if (height[i] > rightMax) {
                    rightMax = height[i];
                }
                maxRightArr[i] = rightMax;
            }

            // 利用前面求出的maxLeftArr/maxRightArr 解下面公式
            // min(maxLeft,maxRight)-height
            for (int i = 0; i < height.length; i++) {
                int size = Math.min(maxLeftArr[i], maxRightArr[i]);
                sum += (size < height[i] ? 0 : size - height[i]);
            }

//            for (int i = height.length - 1; i >= 0; i--) {
//                System.out.print(maxLeftArr[i] + " ");
//            }
//            System.out.println();
//            for (int i = height.length - 1; i >= 0; i--) {
//                System.out.print(maxRightArr[i] + " ");
//            }

            return sum;
        }

        /**
         * time O(n^2)
         * space O(1)
         * min(maxLeft,maxRight)-height
         *
         * @param height
         * @return
         */
        public int BF(int[] height) {

            int left = 0;
            int right = 0;
            int index = 0;

            int sum = 0;
            for (int i = 0; i < height.length; i++) {
                left = 0;
                right = 0;
                index = i;
                //go left 求左高
                while (index > 0) {
                    index--;
                    if (height[index] > left) {
                        left = height[index];
                    }
                }
                //go right 求右高
                index = i;
                while (index < height.length - 1) {
                    index++;
                    if (height[index] > right) {
                        right = height[index];
                    }
                }

                //解 min(maxLeft,maxRight)-height
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