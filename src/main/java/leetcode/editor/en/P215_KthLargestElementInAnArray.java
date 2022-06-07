package leetcode.editor.en;

// P215_KthLargestElementInAnArray

public class P215_KthLargestElementInAnArray {

    public static void main(String[] args) {

        Solution solution = new P215_KthLargestElementInAnArray().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //quicksort https://alrightchiu.github.io/SecondRound/comparison-sort-quick-sortkuai-su-pai-xu-fa.html

        //selection sort

        public int findKthLargest(int[] nums, int k) {
            int length = nums.length;
            int end = nums.length - 1;
            quickSort(nums, 0, end);
            return nums[length - k];
        }

        void quickSort(int[] nums, int start, int end) {
            //終止條件
            if (start < end) {
                //目標是「在pivot左邊的數，都比pivot還小」，
                //   而「在pivot右邊的數，都比pivot還大」。
                int pivot = partition(nums, start, end);
                quickSort(nums, start, pivot - 1);
                quickSort(nums, pivot + 1, end);
            }
        }

        /**
         * 從start開始到end, 每個元素跟pivot做比較
         * 如果nums[j] < pivot
         *  index++; swap(nums[j], nums[index]);
         *
         * @param nums
         * @param start
         * @param end
         * @return
         */
        int partition(int[] nums, int start, int end) {
            int pivot = nums[end];
            //一開始將index(i)初始化為front-1，因為有可能數列中，所有數都比pivot大。
            int index = start - 1;
            for (int j = start; j < end; j++) {
                if (nums[j] < pivot) {
                    //一旦發現有數比pivot小，index(i)便往後移動(i++)，
                    // 表示「所有小於pivot的數所形成的數列」又增加了一名成員。
                    index++;
                    swap(nums, index, j);
                }
            }

            index++;
            swap(nums, index, end);
            return index;
        }

        void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}