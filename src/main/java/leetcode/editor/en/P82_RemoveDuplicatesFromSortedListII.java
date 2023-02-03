package leetcode.editor.en;

// P82_RemoveDuplicatesFromSortedListII

import leetcode.editor.en.LinkList.ListNode;

public class P82_RemoveDuplicatesFromSortedListII {
      
      public static void main(String[] args) {
      
           Solution solution = new P82_RemoveDuplicatesFromSortedListII().new Solution();
           
      }
      
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        boolean duplicate = false;
        ListNode ptr = head;
        ListNode next = ptr.next;

        ListNode pSlow = head;
        int len = 0;

        //先找真正的head

        while (ptr != null) {
            //跳到下個不重複點
            while (next != null && next.val == ptr.val) {
                duplicate = true;
                next = next.next;
            }
            if (duplicate == true) {
                //ptr有重複,  ptr不是最後存活者
                if (len == 0) {
                    pSlow = next;
                } else {

                }

            } else {
                //ptr無重複, ptr確定是最後存活者
                // pSlow 跟下個不重複點對接
                pSlow.next = next;
                len ++;
            }

            //ptr 跟下個不重複點對接
            ptr.next = next;

            //ptr 往後走, duplicate reset
            ptr = ptr.next;
            duplicate = false;
        }

        return pSlow;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

      
  }