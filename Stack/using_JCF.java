import java.util.*;

public class using_JCF {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
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
