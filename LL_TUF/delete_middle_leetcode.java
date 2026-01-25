package LL_TUF;

public class delete_middle_leetcode {
    class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data=data;
            this.next=null;
        }
    }

    // Correct but 1 traversed 2 times 


    // public Node findmid(Node head) {
    //     Node slow=head;
    //     Node fast=head;

    //     while (fast!=null && fast.next!=null) {
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     return slow;
    // }
    // public Node deleteMiddle(Node head) {

    //     if(head==null || head.next==null) return head;

    //     Node midNode=findmid(head);
    //     Node temp=head;

    //     while (temp.next!=midNode) {
    //         temp=temp.next;
    //     }

    //     temp.next=midNode.next;
        
    //     return head;
    // }

    public Node deleteMiddle(Node head) {

    if (head == null || head.next == null) return null;

    Node slow = head;
    Node fast = head;
    Node prev = null;

    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    prev.next = slow.next;

    return head;
}

}
