package leetcode.editor.en;

// P142_LinkedListCycleII

import leetcode.editor.en.LinkList.ListNode;

public class P142_LinkedListCycleII {

    public static void main(String[] args) {

        Solution solution = new P142_LinkedListCycleII().new Solution();

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
        public ListNode detectCycle(ListNode head) {

            ListNode oneStep = head;
            ListNode twoStep = head;
            while (twoStep != null && twoStep.next != null) {
                oneStep = oneStep.next;
                twoStep = twoStep.next.next;

                //cycle exist
                if (oneStep == twoStep) {
                    //數學公式
                    // head a {q} b {p}
                    //         |     |
                    //         -  c  -
                    // 2(a+b) = a+2b+c
                    // a = c
                    // slow從p往q走的距離(c) 跟 slow2從head往q走的距離(a) 一樣(速度也一樣) ~~~
                    ListNode oneStep2 = head;
                    while (oneStep != oneStep2) {
                        System.out.println(oneStep2.val + " " + oneStep.val);
                        oneStep = oneStep.next;
                        oneStep2 = oneStep2.next;
                    }
                    return oneStep;
                }
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}