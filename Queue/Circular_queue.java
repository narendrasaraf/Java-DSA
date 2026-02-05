package Queue;

public class Circular_queue {
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        static int front;

        Queue (int data) {
            arr= new int[data];
            size=data;
            rear=-1;
            front=-1;
        }

        // isEmpty
        public static boolean isEmpty() {
            return rear==-1 && front==-1 ;
        }

        // isFull
        public static boolean isFull() {
            return (rear+1)%size==front;
        }

        // Add
        public static void Add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(front==-1) {
                front=0;
                rear =0;
                return;
            } else {
                rear=(rear+1)%size;
            }
            arr[rear]=data;
        }

        // Remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result=arr[front];
            if (rear==front) {
                rear=front=-1;
            } else {
                front =(front+1)%size;
            }
            return result;
        }

        // Peek
        public static int peek() {
            if(isEmpty()) return -1;
            int peek=arr[front];
            return peek;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        System.out.println(q.remove());
        q.Add(4);
        System.out.println(q.remove());
        q.Add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
