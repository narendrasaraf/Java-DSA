package Recursion;

public class checkifarrissorted {
    public static boolean checkarr(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            if (nums[i]>nums[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int arr1[] ={1,4,3,2,5};
        System.out.println(checkarr(arr));
        System.out.println(checkarr(arr1));
    }
}
