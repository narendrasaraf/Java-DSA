package Queue;
import java.util.*;
public class Queue_using_Stack {
    static class Queue {
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>(); 

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void Add(int data) {
            // Step 1 - if not empty pop from s1 and push to s2
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Step 2 - Add to s1 
            s1.push(data);

            // Step 3 - bring back to s2
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove () {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
             return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
             return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.isEmpty();
        q.peek();
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.peek();

    }
}
