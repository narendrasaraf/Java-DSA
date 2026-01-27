import java.util.ArrayList;

public class stack {
    static class Stack{
        static ArrayList <Integer>list=new ArrayList<>();

        // Isempty ?
        public static boolean isEmpty() {
            return list.size()==0;
        }

        // Push Function
        public static void push(int data) {
            list.add(data);
        }

        // Pop function
        public static int pop() {
            if(list.isEmpty()) return -1;
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // Peek Function
        public static int peek() {
            if(list.isEmpty()) return -1;
            int top=list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.peek());

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
