package leetcode.editor.en;

import leetcode.editor.en.LinkList.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P430_FlattenAMultilevelDoublyLinkedListTest {

    P430_FlattenAMultilevelDoublyLinkedList.Solution solution;
    Node head;

    @BeforeEach
    void setUp() {
        solution = new P430_FlattenAMultilevelDoublyLinkedList().new Solution();
    }

    @Test
    void test() {
        head = testCase1();
        solution.flatten(head);
        new Node().printNode(head);

        head = testCase2();
        solution.flatten(head);
        new Node().printNode(head);

    }

    /**
     *   1 -> null
     *   |
     *   2 -> null
     *   |
     *   3 -> null
     *
     *  1 -> 2 -> 3  null
     */
    private Node testCase2() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        //1
        a.next = null;
        a.prev = null;
        a.child = b;

        //2
        b.next = null;
        b.prev = null;
        b.child = c;

        //3
        c.next = null;
        c.prev = null;
        c.child = null;

        return a;
    }
    /**
     *  1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
     *            |
     *            7 -> 8 -> 9 -> 10 -> null
     *                 |
     *                 11 -> 12 -> null
     *
     *  1 -> 2 -> 3 -> 7 -> 8 -> 11 -> 12 -> 9 -> 10 -> 4 -> 5 -> 6 -> null
     */
    private Node testCase1() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);
        Node l = new Node(12);

        //1
        a.next = b;
        a.prev = null;
        //2
        b.next = c;
        b.prev = a;
        //3 -> 7
        c.next = d;
        c.prev = b;
        c.child = g;
        //4
        d.next = e;
        d.prev = c;
        //5
        e.next = f;
        e.prev = d;
        //6
        f.next = null;
        f.prev = e;

        //7
        g.next = h;
        g.prev = null;
        //8 -> 11
        h.next = i;
        h.prev = g;
        h.child = k;
        //9
        i.next = j;
        i.prev = h;
        //10
        j.next = null;
        j.prev = i;

        //11
        k.next = l;
        k.prev = null;
        //12
        l.next = null;
        l.prev = k;

        return a;

    }
}