package leetcode.editor.en;

// P215_KthLargestElementInAnArray

public class P215_KthLargestElementInAnArray {

    public static void main(String[] args) {

        Solution solution = new P215_KthLargestElementInAnArray().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //quicksort
        //selection sort

        public int findKthLargest(int[] nums, int k) {
            int length = nums.length - 1;
            quickSort(nums, 0, length);
            return nums[length - k];
        }

        void quickSort(int[] nums, int start, int end) {
            int length = nums.length;
            int pivot = partion(nums, 0, length - 1);
            quickSort(nums, start, pivot - 1);
            quickSort(nums, pivot + 1, end);

        }

        int partion(int[] nums, int start, int end) {
            int pivot = 0;

            return pivot;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}