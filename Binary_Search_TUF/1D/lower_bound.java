// package Binary_Search_TUF.1D;

public class lower_bound {
    public static int optimal(int[] nums, int target) {
    int low = 0, high = nums.length-1;

    while (low <= high) {
        int mid =(high+low)/2;

        if (target>nums[mid]) {
            low = mid + 1;
        } else {
            high = mid;
        }
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
