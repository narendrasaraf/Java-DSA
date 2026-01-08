public class search_rotated_arr2 {
    public static boolean optimal(int[] nums,int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(target==nums[mid]) return true;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]) {
                low++;
                high--;
            }
            else if(nums[mid]<=nums[high]) {
                if (target>=nums[mid] && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
            else {
                if (target>=nums[low] && target <=nums[mid]) high=mid-1;
                else low=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
        int target=3;
        boolean result=optimal(nums,target);
        System.out.println(result);
    }
}
