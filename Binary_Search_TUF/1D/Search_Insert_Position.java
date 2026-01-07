// package Binary_Search_TUF.1D;

public class Search_Insert_Position {
    public static int optimal(int nums[],int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        
        while (low<=high) {
            int mid=(low+high)/2;

            if (target==nums[mid]) return mid;
            else if(target>nums[mid]) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=10;
        int result1=optimal(nums,target);
        System.out.println(result1);
    }
}
