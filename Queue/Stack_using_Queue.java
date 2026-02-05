package Queue;

import java.util.*;

public class Stack_using_Queue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean empty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (!q1.isEmpty())
                q1.add(data);
            else
                q2.add(data);
        }

        public static int pop() {
            if (empty()) return -1;
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (!q1.isEmpty()) {
                        q2.add(top);
                    }
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (!q2.isEmpty()) {
                        q1.add(top);
                    }
                }
            }
            return top;
        }

        public static int peek() {
            if (empty()) return -1;
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                }
            }
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s1=new Stack();
        System.out.println(s1.peek());
        System.out.println(s1.empty());

    }
}
