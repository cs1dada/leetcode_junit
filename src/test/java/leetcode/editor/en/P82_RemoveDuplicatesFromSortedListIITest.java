package leetcode.editor.en;

import leetcode.editor.en.LinkList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P82_RemoveDuplicatesFromSortedListIITest {

    P82_RemoveDuplicatesFromSortedListII.Solution solution;
    ListNode node;

    @BeforeEach
    void setUp() {
        solution = new P82_RemoveDuplicatesFromSortedListII().new Solution();
    }


    /**
     * Input: head = [1,1,1,2,3]
     * Output: [2,3]
     */
    @Test
    void test() {
        node = case1();
        ListNode  result = solution.deleteDuplicates(node);

        System.out.println(Arrays.toString(new ListNode().printList(result,10)));

    }
    ListNode case1() {


        // 1 -> 2 -> 2

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);


        a.next = b;
        b.next = c;

        return a;
    }



    ListNode case11() {


// 1 -> 1 -> 2 -> 2 -> 3 -> 4

// 1 -> 1 -> 2 -> 2 -> 3 -> 4 -> 4 -> 5

// 1 -> 2 -> 2 -> 3 -> 4 -> 4

// 1 -> 2 -> 3 -> 4 -> 4 -> 5

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        return a;
    }
}