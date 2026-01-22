package LL_TUF;

public class LinkedList {
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
    public void addLast(int data) {
        Node newNode=new Node(data);
        size++;
        if(head==null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print() {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int index,int data) {
        Node newNode=new Node(data);
        if (index==0) {
            addFirst(data);
            return;
        }
        Node temp=head;
        size++;
        int i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void removeFirst(){
        if (head==null) {
            System.out.println("LL is empty");
            return;
        }
        head=head.next;
        size--;
    }
    public void removeLast() {
        if (head==null) {
            System.out.println("LL is empty");
            return;
        }
        if (size==1) {
            removeFirst();
            return;
        }
        Node temp=head;
        while(temp.next!=tail) {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
    }
    public void removeMiddle(int index) {
        if (head==null) {
            System.out.println("LL is empty");
            return;
        }
        if (index==0) {
            removeFirst();
            return;
        }
        if (index <0 || index> size) {
            System.out.println("Invalid index");
            return;
        }
        Node temp=head;
        int i=0;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        Node delNode=temp.next;
        temp.next=delNode.next;
        size--;

        if(delNode==tail){
            tail=temp;
        }
    }
    // Iterative Search
    public int search(int key) {
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if (temp.data==key) return i;
            temp=temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search
    public int searchRecursive(int key) {
        return helper(head,key);
    }
    public int helper(Node head,int key) {
        if(head==null) return -1;
        if(head.data==key) return 0;
        int index=helper(head.next, key);
        if(index==-1) return -1;
        return index+1;
    }
    public void reverse() {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        // ll.addMiddle(2, 5);
        // ll.removeFirst();
        // ll.removeLast();
        ll.print();
        // System.out.println(ll.size);
        // ll.search(5);
        // ll.searchRecursive(5);
        ll.reverse();
        ll.print();
    }
}
