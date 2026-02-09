package Recursion;

public class arr_isSorted {
    public static boolean isSorted(int[] nums,int index) {
        if(index==nums.length-1) return true;
        if(nums[index]>nums[index+1]) return false;
        return isSorted(nums, index+1);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,6,5};
        System.out.println(isSorted(nums, 0));
    }
}
