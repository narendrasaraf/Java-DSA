package LL_TUF;

public class zigzag {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public Node findMid(Node head) {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node reverseSecondHalf(Node midNode) {
        Node prev=null;
        Node curr=midNode.next;
        Node next;
        midNode.next=null; //breaking the link

        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void zigzag(Node head) {
        // Step 1 Find mid
        Node midNode=findMid(head);
        // Step 2 Reverse 2nd Half
        Node RightHead=reverseSecondHalf(midNode);
        Node LeftHead=head;
        // Step 3 Merge Alternate Nodes from 1st and 2nd Half
        Node nextL,nextR;
        while(LeftHead!=null && RightHead!=null) {
            nextL=LeftHead.next;
            LeftHead.next=RightHead;
            nextR=RightHead.next;
            RightHead.next=nextL;
            // Update Heads
            LeftHead=nextL;
            RightHead=nextR;
        }
    }
    public static void main(String[] args) {
        zigzag ll=new zigzag();
        Node head=ll.new Node(1);
        head.next=ll.new Node(2);
        head.next.next=ll.new Node(3);
        head.next.next.next=ll.new Node(4);
        head.next.next.next.next=ll.new Node(5);
        head.next.next.next.next.next=ll.new Node(6);

        ll.zigzag(head);

        // Print ZigZag List
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
