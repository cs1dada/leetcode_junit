package leetcode.editor.en;

// P92_ReverseLinkedListII

import leetcode.editor.en.LinkList.ListNode;

public class P92_ReverseLinkedListII {

    public static void main(String[] args) {

        Solution solution = new P92_ReverseLinkedListII().new Solution();

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
        /**
         * space O(1)
         * time O(n)
         *
         * 走到left, 切換成reverseLinkList
         * 1 -> [2 -> 3 -> 4] -> 5
         *      [2 <- 3 <- 4]
         *      
         * edge case
         * 测试用例:[5] 1 1
         * 测试用例:[3,5] 1 2
         *
         * @param head
         * @param left
         * @param right
         * @return
         */
        public ListNode reverseBetween(ListNode head, int left, int right) {
            int pos = 1;
            ListNode cur = head;

            if (left == right)
                return head;
            if (left == pos)
                return reverseLinkList(cur, pos, right);

            //first
            while (cur != null) {
                if (pos < left - 1) {
                    //前進下一位
                    cur = cur.next;
                    pos++;
                } else if (pos == left - 1) {
                    //left 前面一個的node
                    cur.next = reverseLinkList(cur.next, ++pos, right);
                    break;
                }
            }

            return head;

        }

        ListNode reverseLinkList(ListNode head, int pos, int right) {

            ListNode cur = head;
            ListNode pre = null;
            ListNode next = null;

            ListNode reverseHead = null;
            ListNode reversetail = head;

            while (cur != null && pos <= right) {
                //暫存next
                next = cur.next;
                //反轉, 下一位指向pre
                cur.next = pre;
                //前進下一位前, 設定自己為pre
                pre = cur;
                //前進下一位
                cur = next;
                pos++;
            }
            reverseHead = pre;
            reversetail.next = next;

            return reverseHead;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}

