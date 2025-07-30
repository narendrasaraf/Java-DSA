package ArrayList;

import java.util.*;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<Float> list2 =new ArrayList<>();
        ArrayList<Boolean> list3 =new ArrayList<>();
        ArrayList<String> list4 =new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.get(2);
        System.out.println(list.get(3));

        System.out.println(list.remove(2));
        list.set(2, 7);
        System.out.println(list);

        System.out.println(list);

        // Traverse through Arraylist
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
