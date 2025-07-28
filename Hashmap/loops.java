import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class loops {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 100);
        map.put("China",150);
        map.put("USA",50);
        map.put("USSR",75);
        map.put("UK",10);

        System.out.println(map);
        Set<String> keys=map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Country is "+k+", and their population is: "+map.get(k));
        }
        
    }
}
