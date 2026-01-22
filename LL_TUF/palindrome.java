package LL_TUF;

public class palindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public Node findMid(Node head) {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }    
        return slow;
    }
    
}
