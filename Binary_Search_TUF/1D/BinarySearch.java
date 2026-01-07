public class BinarySearch {
    public static int brute(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++) {
            if (target==nums[i]) {
                return i;
            }
        }
        return -1;
    }
    
    // Optimal Approach
    public static int optimal(int[] nums,int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        
        while (low<=high) {
            int mid=(low+high)/2;
            if (target==nums[mid]) return mid;
            else if(target > nums[mid]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        int result=brute(nums,target);
        int result1=optimal(nums,target);
        System.out.println(result);
        System.out.println(result1);
    }
}
