public class Find_min_rotated_arr {
    public static int optimal(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<high) {
            int mid=(low+high)/2;
            if(nums[mid]<=nums[high]) high=mid;
            else low=mid+1;
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        int result=optimal(nums);
        System.out.println(result);
    }
}
