package leetcode.editor.en;

// P206_ReverseLinkedList

import leetcode.editor.en.LinkList.ListNode;

public class P206_ReverseLinkedList {

    public static void main(String[] args) {

        Solution solution = new P206_ReverseLinkedList().new Solution();

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
         * recursvie方法
         * 指向下家的指標改指到上家
         *
         * 1 -> 2 -> 3 -> 4 -> 5
         * 1 <- 2 <- 3 <- 4 <- 5
         *
         * @param head
         * @return
         */
        public ListNode reverseList(ListNode head) {

            return recursvie(head, null);

        }

        private ListNode recursvie(ListNode head, ListNode pre) {
            ListNode cur = head;
            ListNode next = null;

            //base條件 => tail的下家null結束
           if (cur == null){
               return pre;
           }

            //暫存下家
            next = cur.next;
            //下一個指向pre
            cur.next = pre;
            //自己變成pre
            pre = cur;
            //往下一個loop
            return recursvie(next, pre);
        }

        /**
         * iterative方法
         * 指向下家的指標改指到上家
         * 1 -> 2 -> 3 -> 4 -> 5
         * 1 <- 2 <- 3 <- 4 <- 5
         *
         * @param head
         * @return
         */
        public ListNode reverseList_opt1(ListNode head) {
            ListNode cur = head;
            ListNode next = null;
            ListNode pre = null;

            while (cur != null) {
                //暫存下家
                next = cur.next;
                //下一個指向pre
                cur.next = pre;
                //自己變成pre
                pre = cur;
                //往下一個loop
                cur = next;

            }
            return pre;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)


}