import java.util.*;

public class reverse_stack {
    public static  void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void ReverseStack(Stack<Integer>s) {
        if (s.isEmpty()) {
            return;
        }
        int top=s.pop();
        ReverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printstack(Stack<Integer>s){
        while (!s.isEmpty()) {
           System.out.print(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        // printstack(s);
        ReverseStack(s);
        printstack(s);
    }
}
