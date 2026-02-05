package Queue;

public class Using_LL {
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty () {
            return head==null && tail==null;
        }

        public static void Add(int data) { 
            Node newNode=new Node(data);
            if (head==null) {
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front =head.data;
            if (tail==head) {
                tail=head=null;
            } else head=head.next;
            return front;
        }
        public static int peek(){
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q =new Queue();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        System.out.println(q.peek());
        q.Add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
