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
    public boolean isPalindrome(Node head){
        if(head==null || head.next==null) return true;
        // Step 1 Find Mid
        Node mid=findMid(head);
        // Step 2 reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        // Step 3 compare both halves
        Node right=prev; // head of the 2nd half
        Node left=head;

        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        palindrome ll=new palindrome();
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(1);

        System.out.println(ll.isPalindrome(head));
    }
}
