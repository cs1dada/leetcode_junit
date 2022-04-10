package leetcode.editor.en.LinkList;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int[] printList(ListNode input, int length) {
        int[] myList = new int[length];
        ListNode current = input;
        int i = 0;
        while (current != null) {
            myList[i] = current.val;
            current = current.next;
            i++;
        }
        return myList;
    }

}
