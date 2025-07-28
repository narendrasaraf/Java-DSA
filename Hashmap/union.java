import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5,6,7};
        int nums2[]={4,5,6,7,8,9,10};

        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<nums1.length;i++) {
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++) {
            set.add(nums2[i]);
        }

        System.out.println("Size of Union of 2 Arrays are: "+set.size());
        System.out.println("and the elements are: "+set);
        
    }
}
