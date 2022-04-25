package leetcode.editor.en;

import leetcode.editor.en.LinkList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P142_LinkedListCycleIITest {

    P142_LinkedListCycleII.Solution solution;
    ListNode node;

    @BeforeEach
    void setUp() {
        solution = new P142_LinkedListCycleII().new Solution();
    }

    @Test
    void test() {
        node = case2();
        System.out.println(solution.detectCycle(node) != null ? solution.detectCycle(node).val : "null");

    }

    ListNode case1() {
        // 3 -> 2 -> 0 -> -4
        //      ^          |
        //      |----------|
        //2   0
        //0   2
        //-4  -4

        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        return a;
    }

    ListNode case2() {
        return null;

    }
}