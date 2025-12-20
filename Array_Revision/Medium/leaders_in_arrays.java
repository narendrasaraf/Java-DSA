package Array_Revision.Medium;

import java.util.ArrayList;

public class leaders_in_arrays {
    // Brute Force Approach(own logic 🚀)
    public static ArrayList<Integer> brute(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++) {
            boolean isLeader=true;
            for(int j=i+1;j<n;j++) {
                if (nums[j]>nums[i]) {
                    isLeader=false;
                    break;
                }
            }
            if (isLeader) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    // Optimal Approach
    public static ArrayList<Integer> optimal(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        int max=nums[n-1];
        list.add(max);
        for(int i=n-2;i>=0;i--) {
            if (nums[i]>=max) {
                max=nums[i];
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {4, 7, 1, 0};
        ArrayList<Integer>result=brute(nums);
        for(int i:result) {
            System.out.print(i+" ");
        }
        System.out.println();
        ArrayList<Integer>result1=optimal(nums);
        for(int i:result1) {
            System.out.print(i+" ");
        }
    }
}
