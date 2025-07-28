import java.util.HashSet;

public class intersection {
 public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
    int nums1[]={1,2,3,4,5,6,7};
    int nums2[]={4,5,6,7,8,9,10};
    
    for(int i=0;i<nums1.length;i++) {
        set.add(nums1[i]);
    }
    int intersection=0;
    for(int i=0;i<nums2.length;i++) {
        if (set.contains(nums2[i])) {
            intersection++;   
            set.remove(nums2[i]);
        }
    }
    System.out.println("Intersection os 2 Arrays are: "+set);
    System.out.println("and the size of intersection of array is: "+set.size());
 }   
}
