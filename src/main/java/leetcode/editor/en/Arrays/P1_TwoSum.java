package leetcode.editor.en.Arrays;

// P1_TwoSum

import java.util.HashMap;

public class P1_TwoSum {

    public static void main(String[] args) {

        Solution solution = new P1_TwoSum().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        /**
         * time O(n)
         * space O(n)
         * <p>
         * 第一個for,計算matchNumber, 並從hashmap找有沒有對應的matchNumber
         * 沒有的話把自己放到hashmap, 當作別人的matchNumber候選人
         * hashmap找資料只要time O(1) => 用空間換取時間
         */
        public int[] twoSum(int[] nums, int target) {
            if (nums.length <= 1)
                return null;

            HashMap match = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                int matchNumber = target - nums[i];

                if (match.get(matchNumber) != null) {
                    int[] arr = {(Integer) match.get(matchNumber), i};
                    return arr;
                } else {
                    // nums[i], index
                    match.put(nums[i], i);
                }
            }

            return null;
        }

        /**
         * time O(n^2)
         * space O(1)
         * time >>> space => 利用space來改善time
         * 第一個for,計算matchNumber
         * 第二個for,loop nums找有沒有對應的matchNumber
         */
        public int[] twoSumBruteForce(int[] nums, int target) {
            System.out.println("twoSumBruteForce");
            if (nums.length <= 1)
                return null;

            for (int i = 0; i < nums.length; i++) {
                int matchNumber = target - nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == matchNumber) {
                        int[] arr = {i, j};
                        return arr;
                    }
                }
            }

            return null;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)


}