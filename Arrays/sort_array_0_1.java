import java.util.*;
public class sort_array_0_1 {
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
    }
    public void sortZeroOneTwo(int[] nums) {
        int lp=0;
        int rp=nums.length-1;

        while (lp<=rp) {
            if (lp==rp) {
                swap(nums[lp+1], rp);
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={1,0,1,0,0,0,1,1,1};
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.print(i);
        }
    }
}
