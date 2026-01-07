// package Binary_Search_TUF.1D;

public class lower_bound {
    public static int optimal(int[] nums, int target) {
    int low = 0;
    int high = nums.length-1;
    int ans=nums.length;

    while (low <= high) {
        int mid =(high+low)/2;

        if (nums[mid]>=target) {
            ans=mid;
            low = mid + 1;
        } else {
            low=mid+1;
        }
    }
        return ans; 
    }
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=10;
        int result1=optimal(nums,target);
        System.out.println(result1);
}
}
