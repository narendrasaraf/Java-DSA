package LL_TUF;

public class DoubleLL {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    // Remove
    public void removeFirst(){
        if(size==0){
            System.out.println("DLL is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }
    // REMOVE LAST
    public void removeLast(){
        if(size==0){
            System.out.println("DLL is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        else{
            tail=tail.prev;
            tail.next=null;
            size--;
        }
    }
    // ADD LAST
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    // ADD at INDEX
    public void addAtIndex(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        if(idx==size){
            addLast(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
    }
    // REMOVE at INDEX
    public void removeAtIndex(int idx){
        if(idx==0){
            removeFirst();
            return;
        }
        if(idx==size-1){
            removeLast();
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size--;
    }
    // PRINT DLL
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // REVERSE DLL
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        // Update head and tail
        Node temp=head;
        head=tail;
        tail=temp;
    }
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addLast(0);
        dll.addAtIndex(2,5);
        dll.print(); 
        dll.removeAtIndex(2);
        dll.print(); 
        dll.removeFirst();
        dll.print(); 
        dll.removeLast();
        dll.print(); 
        dll.reverse();
        dll.print(); 
    }
}
