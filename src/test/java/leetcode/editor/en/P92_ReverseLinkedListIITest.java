package leetcode.editor.en;

import leetcode.editor.en.LinkList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P92_ReverseLinkedListIITest {

    P92_ReverseLinkedListII.Solution solution;

    @BeforeEach
    void setUp() {
        solution = new P92_ReverseLinkedListII().new Solution();
    }

    @Test
    void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // 1 -> [2 -> 3 -> 4] -> 5
        //      [2 <- 3 <- 4]
        // 1 -> [4 -> 3 -> 2] -> 5
        // Input: head = [1,2,3,4,5], left = 2, right = 4
        // Output: [1,4,3,2,5]
        System.out.println(Arrays.toString(new ListNode().printList(node1,5)));
        solution.reverseBetween(node1, 2, 4);
        System.out.println(Arrays.toString(new ListNode().printList(node1,5)));

        // 测试用例:[5] 1 1
        // 测试用例:[3,5] 1 2


    }
}