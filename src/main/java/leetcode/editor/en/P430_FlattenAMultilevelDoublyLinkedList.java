package leetcode.editor.en;

// P430_FlattenAMultilevelDoublyLinkedList

import leetcode.editor.en.LinkList.Node;

public class P430_FlattenAMultilevelDoublyLinkedList {

    public static void main(String[] args) {

        Solution solution = new P430_FlattenAMultilevelDoublyLinkedList().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/

*/

    class Solution {

        /**
         *  1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
         *            |
         *            7 -> 8 -> 9 -> 10 -> null
         *                 |
         *                 11 -> 12 -> null
         *
         *  1 -> 2 -> 3 -> 7 -> 8 -> 11 -> 12 -> 9 -> 10 -> 4 -> 5 -> 6 -> null
         */
        public Node flatten(Node head) {
            recur(head);
            return  head;
        }

        /**
         * recsive 在找child list的尾巴時候會進入循環~(flatten之後的點+找child list的尾巴)
         * @param head
         * @return
         */
        public Node recur(Node head) {
            Node curr = head;
            Node next = null;
            Node prev = null;
            Node child = null;

            if (curr == null)
                return  head;

            while (curr != null) {
                //紀錄最後一個不是null的點
                prev = curr;
                //先找到有child的node 或是 找到尾巴
                if (curr.child == null) {
                    curr = curr.next;
                    continue;
                }

                //有child的node
                //暫存next
                next = curr.next;
                //暫存child
                child = curr.child;
                //curr改指到child
                curr.next = child;
                child.prev = curr;
                curr.child = null;

                //找到child list的尾巴
                Node childTail = recur(child);

                //child list的尾巴 指到 暫存next
                if(next != null) {
                    childTail.next = next;
                    next.prev =childTail;
                }
                curr = child;

            }

            return prev;
        }

        public Node flatten_iterative(Node head) {
            Node curr = head;
            Node next = null;
            Node child = null;

            if (curr == null)
                return  head;

            while (curr != null) {
                //先找到有child的node
                if (curr.child == null) {
                    curr = curr.next;
                    continue;
                }

                //有child的node
                //暫存next
                next = curr.next;
                //暫存child
                child = curr.child;
                //curr改指到child
                curr.next = child;
                child.prev = curr;
                curr.child = null;

                //找到child list的尾巴
                curr = child;
                while (curr.next !=null) {
                    curr = curr.next;
                }
                //child list的尾巴 指到 暫存next
                if(next != null) {
                    curr.next = next;
                    next.prev =curr;
                }
                curr = child;

            }

            return head;

        }

        public Node flatten_bf(Node head) {
            Node curr = head;
            Node next = null;
            Node child = null;

            //先找到有child的node
            while (curr != null && curr.child == null) {
                curr = curr.next;
            }

            if (curr == null) {
                return head;
            } //有child的node
            else {

                //暫存next
                next = curr.next;
                //暫存child
                child = curr.child;
                //curr改指到child
                curr.next = child;
                child.prev = curr;
                curr.child = null;

                //找到child list的尾巴
                curr = child;
                while (curr != null && curr.next !=null) {
                    curr = curr.next;
                }
                //child list的尾巴 指到 暫存next
                if(next != null) {
                    curr.next = next;
                    next.prev =curr;
                }

            }

            flatten_bf(child);

            return head;

        }


    }
//leetcode submit region end(Prohibit modification and deletion)


}