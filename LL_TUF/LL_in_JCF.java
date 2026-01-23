package LL_TUF;
import java.util.LinkedList;

public class LL_in_JCF {
    public static void main(String[] args) {
        // Create
        LinkedList<Integer> ll=new LinkedList<>();
    
        // Add
        ll.addFirst(1);
        ll.add(2);
        ll.add(3);
        ll.addLast(4);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }
}
