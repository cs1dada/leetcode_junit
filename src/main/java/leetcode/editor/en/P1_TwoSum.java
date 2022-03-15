package leetcode.editor.en;

// P1_TwoSum

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        System.out.println("twoSumBruteForce");
        if (nums.length <= 1)
            return null;

        for (int i = 0; i < nums.length; i++) {
            int matchNumber = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == matchNumber) {
                    int[] arr = { i, j };
                    return arr;
                }
            }
        }

        return null;
    };
}
//leetcode submit region end(Prohibit modification and deletion)
