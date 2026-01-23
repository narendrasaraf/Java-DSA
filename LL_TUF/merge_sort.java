package LL_TUF;
// import LL_TUF.LinkedList;

public class merge_sort {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow; //returning mid node
    }
    public Node merge(Node head1,Node head2) {
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1!=null && head2!=null) {
            if (head1.data<=head2.data) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null) {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node MergeSort(Node head) {
        // Corner Case
        if(head==null || head.next==null) return head;

        // Finding Mid
        Node mid= getMid(head);
        // Left & Right Half sort using MergeSort
        Node righthead=mid.next;
        mid.next=null;
        Node newLeft=MergeSort(head);
        Node newRight=MergeSort(righthead);

        // Merge
        return merge(newLeft,newRight);
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data) {
        Node newNode=new Node(data);
        size++;
        if(head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {
        merge_sort ll=new merge_sort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        head=ll.MergeSort(head);
        System.err.println("Sorted Linked List:");
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
