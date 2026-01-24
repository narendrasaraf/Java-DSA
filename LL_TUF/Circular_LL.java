package LL_TUF;

public class Circular_LL {
    class Node{
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

    public void add(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }
    // remove
    public void remove(){
        if(size==0){
            System.out.println("CLL is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        else{
            head=head.next;
            tail.next=head;
            size--;
        }
    }
    // print
    public void print(){
        if(size==0){
            System.out.println("CLL is empty");
            return;
        }
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("(head)");
    }
    // add at index
    public void addAtIndex(int index,int data){
        if(index==0){
            add(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // remove at index
    public void removeAtIndex(int index){   
        if(index==0){
            remove();
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    // print
    public void printCircular(){
        if(size==0){
            System.out.println("CLL is empty");
            return;
        }
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("(head)");
    }
    // get size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Circular_LL cll=new Circular_LL();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);
        cll.printCircular(); // 1 -> 2 -> 3 -> 4 -> (head)
        cll.addAtIndex(2,5);
        cll.printCircular(); // 1 -> 2 -> 5 -> 3 -> 4 -> (head)
        cll.removeAtIndex(3);
        cll.printCircular(); // 1 -> 2 -> 5 -> 4 -> (head)
        cll.remove();
        cll.printCircular(); // 2 -> 5 -> 4 -> (head)
        System.out.println("Size of CLL: " + cll.getSize()); // Size of CLL: 3
    }
}
