// package Binary_Search_TUF.1D;

public class Floor_Ceil {
    public static int[] optimal(int[] nums,int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;

        while (low<=high) {
            int mid =(low+high)/2;
            if (target>=nums[mid]) low=mid+1;
            else high=mid-1;

        }
        int floor = (high >= 0) ? nums[high] : -1;
        int ceil  = (low < n)   ? nums[low]  : -1;
        return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        int[] nums ={3, 4, 4, 7, 8, 10};
        int target= 11;
        int[] result=optimal(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
