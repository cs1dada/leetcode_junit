package leetcode.editor.en;

// P83_RemoveDuplicatesFromSortedList

import leetcode.editor.en.LinkList.ListNode;

public class P83_RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        Solution solution = new P83_RemoveDuplicatesFromSortedList().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null)
                return null;
            if (head.next == null)
                return head;

            ListNode ptr = head;
            ListNode next = ptr.next;

            while (ptr != null) {
                //如果下一個點重複, 跳到下個不重複點
                while (next != null && next.val == ptr.val) {
                    next = next.next;
                }
                //ptr 跟下個不重複點對接
                ptr.next = next;

                //ptr 往後走
                ptr = ptr.next;
            }

            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}