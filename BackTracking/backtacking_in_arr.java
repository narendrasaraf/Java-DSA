package BackTracking;

public class backtacking_in_arr {
    public static void backtracking(int[] nums,int i,int val) {
        int n=nums.length;
        // base case
        if(i==n) {
            printarr(nums);
            return;
        }
        // Recursive case
        nums[i]=val;
        backtracking(nums, i+1, val+1);
        // backtracking step
        nums[i]=nums[i]-2;


    }
    public static void printarr(int[] nums) {
        for (int i : nums) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] =new int[5];
        System.out.println("Before backtracking: ");
        backtracking(nums, 0, 1);
        System.out.println("After backtracking: ");
        printarr(nums);
    }
}
