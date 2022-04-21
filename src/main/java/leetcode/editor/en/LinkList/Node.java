package leetcode.editor.en.LinkList;

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {

    }

    public Node(int val, Node prev, Node next, Node child) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }

    public Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
        this.child = null;
    }

    public void printNode(Node input) {
        Node current = input;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
