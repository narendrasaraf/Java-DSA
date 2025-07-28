import java.util.*;

public class intro {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
        map.put("Narendra", 8);
        map.put("Ayush", 8);
        map.put("Pranav", 8);
        
        int narendra=map.get("Narendra");
        map.remove("Pranav");
        System.out.println(map);
        System.out.println(map.containsKey("Pranav"));
        System.out.println(map);
        map.put("Pranav", 8);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());
	}
}
