package LL_TUF;

public class remove_nth_node_end {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void solution(int n) {
        Node temp=head;
        int size=0;
        while (temp!=null) {
            temp=temp.next;
            size++;
        }
        if (n==size) {
            head=head.next;
            return;
        }
        Node prev=head;
        int i=1;
        while(i<size-n) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
}
