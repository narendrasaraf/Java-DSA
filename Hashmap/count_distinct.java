import java.util.HashSet;

public class count_distinct {
    public static void main(String[] args) {
        int nums[]= {1,1,2,2,3,3,4,4,5,5,5,6,6,6,7,7,8,8,9};

        HashSet<Integer> Set=new HashSet<>();

        for(int i=0;i<nums.length;i++) {
            Set.add(nums[i]);
        }

        System.out.println("Distinct Element in Set are "+Set.size());
        System.out.println("Distinct Element in Set are "+Set.size());
    }
}
