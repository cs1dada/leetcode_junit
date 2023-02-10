package leetcode.editor.en;

// P34_FindFirstAndLastPositionOfElementInSortedArray

public class P34_FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {

        Solution solution = new P34_FindFirstAndLastPositionOfElementInSortedArray().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left = left_bound(nums, target);
            //System.out.println("left: " + left);
            int right = right_bound(nums, target);
            //System.out.println("right: " + right);

            return new int[]{left, right};
        }

        /**
         * left   mid   target  right
         * left   target   mid  right
         * 找尋左邊邊界
         *
         * @param nums
         * @param target
         * @return
         */
        private int left_bound(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    right = mid - 1; //找到target不馬上返回, 而是縮小右側區間
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                }
            }
            // 此时 target 比所有数都大，返回 -1
            if ((left >= nums.length) || (nums[left] != target)) {
                return -1;
            } else {
                return left;
            }

        }

        private int right_bound(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    left = mid + 1; //找到target不馬上返回, 而是縮小左側區間
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                }
            }
            // 此时 target 比所有数都小，返回 -1
            if ((right < 0) || (nums[right] != target)) {
                return -1;
            } else {
                return right;
            }

        }
    }


//leetcode submit region end(Prohibit modification and deletion)


}