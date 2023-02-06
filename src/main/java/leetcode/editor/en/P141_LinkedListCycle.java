package leetcode.editor.en;

// P141_LinkedListCycle

import leetcode.editor.en.LinkList.ListNode;

import java.util.HashMap;

public class P141_LinkedListCycle {

    public static void main(String[] args) {

        Solution solution = new P141_LinkedListCycle().new Solution();
        // tips
        // https://matthung0807.blogspot.com/2020/04/floyd-cycle-detection-algorithm-floyd.html

    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            boolean hasCycle = false;
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    hasCycle = true;
                    break;
                }
            }

            return hasCycle;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}