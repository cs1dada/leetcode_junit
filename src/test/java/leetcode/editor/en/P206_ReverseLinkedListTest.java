package leetcode.editor.en;

import leetcode.editor.en.LinkList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P206_ReverseLinkedListTest {
    P206_ReverseLinkedList.Solution solution;


    @BeforeEach
    void setUp() {
        solution = new P206_ReverseLinkedList().new Solution();
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
        // 1 -> 2 -> 3 -> 4 -> 5
        // 1 <- 2 <- 3 <- 4 <- 5

        System.out.println(Arrays.toString(new ListNode().printList(node1,5)));
        System.out.println(Arrays.toString(new ListNode().printList(solution.reverseList(node1),5)));

        ListNode node1node = new ListNode(1);
        System.out.println(Arrays.toString(new ListNode().printList(node1node,1)));
        System.out.println(Arrays.toString(new ListNode().printList(solution.reverseList(node1node),1)));

        System.out.println(Arrays.toString(new ListNode().printList(null,0)));
        System.out.println(Arrays.toString(new ListNode().printList(solution.reverseList(null),0)));



    }
}