public class search_rotated_arr1 {
    public static int optimal(int nums[],int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (nums[mid]==target) return mid;
            else if(nums[mid]<=nums[high]) {
                if (target>=nums[mid] && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
            else {
                if (target>=nums[low] && target <=nums[mid]) high=mid-1;
                else low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        int result=optimal(nums,target);
        System.out.println(result);
    }
}
