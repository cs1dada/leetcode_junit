package leetcode.editor.en;

import leetcode.editor.en.LinkList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P206_ReverseLinkedListTest {
    P206_ReverseLinkedList.Solution solution;


    @BeforeEach
    void setUp() {
        solution = new P206_ReverseLinkedList().new Solution();
    }

    @Test
    void test() {
        ListNode head = new ListNode();
        assertEquals(head,
                solution.reverseList(head));

    }
}