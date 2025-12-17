package Array_Revision.Easy;

public class If_array_sorted {
    public static void if_sorted(int nums[]) {
        for(int i=0;i<nums.length-1;i++) {
            if (nums[i]>nums[i+1]) {
                System.out.println("Not sorted");
                return;
                }
            }
        System.out.println("Sorted");
    }
    public static void main(String[] args) {
        // int nums[]={1,4,3,-5,2};
        int nums1[]={1,2,3,4,5,6,7};
        // if_sorted(nums);
        if_sorted(nums1);
    }
}
