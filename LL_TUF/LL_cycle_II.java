package LL_TUF;

public class LL_cycle_II {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public Node detectCycle(Node head) {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) {
                Node entry=head;
                while(entry!=slow) {
                    entry=entry.next;
                    slow=slow.next;
                }
                return entry; 
            }
        }
        return null; 
    }
}
