package leetcode.editor.en;

// P169_MajorityElement

import java.util.HashMap;
import java.util.Map;

public class P169_MajorityElement {

    public static void main(String[] args) {

        Solution solution = new P169_MajorityElement().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {

            int count = 0;
            int majorityElement = 0;
            //+-互相抵消, 因為major數量大於一半, 所以最後為+
            for (int i = 0; i < nums.length; i++) {
                if (count == 0) {
                    majorityElement = nums[i];
                    count = 1;
                } else if (majorityElement == nums[i]) {
                    count++;
                } else {
                    count--;
                }
            }
            return majorityElement;
        }

        public int majorityElement_hashmap(int[] nums) {

            int count = 0;
            int majorityElement = 0;

            //用map計算每個key出現的次數
            Map<Integer, Integer> map = countNums(nums);

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                //找哪個key的value最大(出現最多次)
                if (count == 0 || (entry.getValue() > count)) {
                    majorityElement = entry.getKey();
                    count = entry.getValue();
                }

            }
            return majorityElement;
        }

        private Map<Integer, Integer> countNums(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            //用map計算每個key出現的次數
            for (int key : nums) {
                if (map.get(key) != null) {
                    //key 出現過
                    map.put(key, map.get(key) + 1);
                } else {
                    //key 第一次出現
                    map.put(key, 1);
                }
            }
            return map;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}