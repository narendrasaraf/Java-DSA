package Array_Revision.Easy;

public class missing_number {
    public static void missingnumber(int[] nums,int n) {
        int l=nums.length;
        int sum=n*(n+1)/2;
        int totalsum=0;

        for(int i=0;i<l;i++) {
            totalsum=totalsum+nums[i];
        }
        int missing=sum-totalsum;
        System.out.println("Missing number is: "+missing);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        missingnumber(nums,5);
    }
}
