package LL_TUF;

public class remove_loop {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public void removecycle() {
        Node slow=head;
        Node fast=head;
        boolean loop=false;

        // Detect cycle
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                loop=true;
                break;
            }
        }

        if(loop==false) return;

        // store previous of fast to to break the loop
        slow=head;
        Node prev=null;
        while (slow!=fast) {
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }

        // breaking the loop
        prev.next=null; 

    }
    public void print(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // remove_loop ll=new remove_loop();
        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=new Node(4);
        // head.next.next.next.next=head.next; // creating loop
        // removecycle();
        // print(head);
    }
}
