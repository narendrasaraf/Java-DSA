package Array_Revision.Easy;

public class largest_number {
    public static int largest(int nums[]) {
        int largest=nums[0];
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>largest) {
                largest=nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int nums[]={1,4,3,-5,2};
        // largest(nums);
        System.out.println(largest(nums));
    }
}
