package Queue;
import java.util.*;
public class Queue_JCF {
    public static void main(String[] args) {
    Queue<Integer>q=new LinkedList<>();
    // Queue<Integer>q=new ArrayDeque<>();
    System.out.println(q.add(1));
    System.out.println(q.add(2));
    System.out.println(q.peek());
    System.out.println(q.remove());
    System.out.println(q.peek()); 
    System.out.println(q.isEmpty());
    }
}
