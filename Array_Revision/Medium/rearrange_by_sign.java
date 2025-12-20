package Array_Revision.Medium;

import java.util.ArrayList;

public class rearrange_by_sign {
    // Brute force approach
    public static int[] brute(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>positive=new ArrayList<>();
        ArrayList<Integer>negative=new ArrayList<>();

        for(int i=0;i<n;i++) {
            if (nums[i]>0) {
                positive.add(nums[i]);
            }
            else {
                negative.add(nums[i]);
            }
        }
        int index=0;
        for(int i=0;i<positive.size();i++) {
            nums[index]=positive.get(i);
            index++;
            nums[index]=negative.get(i);
            index++;
        }
        return nums;
    }

    // Optimal Approach
    public static int[] optimal(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int posi=0;
        int negi=1;

        for(int i=0;i<n;i++) {
            if (nums[i]>0) {
                ans[posi]=nums[i];
                posi=posi+2;
            }
            else {
                ans[negi]=nums[i];
                negi=negi+2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int result[]=brute(nums);
        for(int i:result) {
            System.out.print(i+" ");
        }
        System.out.println();
        int result1[]=optimal(nums);
        for(int i:result1) {
            System.out.print(i+" ");
        }

    }
}
