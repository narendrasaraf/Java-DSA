package LL_TUF;

public class delete_node {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public void deleteNode(Node node) {
        Node temp=head;
        if(head==null) return;
        if(head.data==node.data) {
            head=head.next;
            return;
        }
        while (temp.next!=null) {
            if (temp.next==node) {
                temp.next=node.next;
                return;
            }
            temp=temp.next;
        }
    }
}
