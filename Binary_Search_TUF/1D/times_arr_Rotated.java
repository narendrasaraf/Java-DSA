public class times_arr_Rotated {
    public static int optimal(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while (low<high) {
            int mid=(low+high)/2;
            if(nums[mid]<=nums[high]) high=mid;
            else low=mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int result=optimal(nums);
        System.out.println(result);
    }
}
