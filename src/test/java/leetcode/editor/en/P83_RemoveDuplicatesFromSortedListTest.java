package leetcode.editor.en;

import leetcode.editor.en.LinkList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P83_RemoveDuplicatesFromSortedListTest {

    P83_RemoveDuplicatesFromSortedList.Solution solution;
    ListNode node;

    @BeforeEach
    void setUp() {
        solution = new P83_RemoveDuplicatesFromSortedList().new Solution();
    }

    @Test
    void test() {
        node = case1();
        ListNode  result = solution.deleteDuplicates(node);

        System.out.println(Arrays.toString(new ListNode().printList(result,5)));

    }
    ListNode case1() {
        // 3 -> 2 -> 0 -> -4
        //      ^          |
        //      |----------|
        //2   0
        //0   2
        //-4  -4

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(1);

        a.next = b;
        b.next = c;

        return a;
    }
}