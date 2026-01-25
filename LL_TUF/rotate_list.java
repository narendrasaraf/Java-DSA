package LL_TUF;

public class rotate_list {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;

        // Size calculation
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // you know
        k = k % size;
        if (k == 0)
            return head;

        ListNode newTail = head;

        // finded new tail
        for (int i = 1; i < size - k; i++) {
            newTail = newTail.next;
        }

        // finded newHead
        ListNode newHead = newTail.next;

        // Breaked link
        newTail.next = null;
        temp = newHead;

        // Linked newHead
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        return newHead;
    }

}
