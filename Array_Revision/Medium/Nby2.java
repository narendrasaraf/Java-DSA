package Array_Revision.Medium;

import java.util.HashMap;

public class Nby2 {
    // Brute Force Approach
    public static int brute(int [] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++) {
            int count =0;
            for(int j=0;j<n;j++) {
                if (nums[j]==nums[i]) {
                    count++;
                }
            }
            if (count>n/2) {
                return nums[i];
            }
        }
        return -1;
    }

    // Better Approach
    public static int better(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if (map.get(nums[i])>n/2) {
                return nums[i];
            }
        }
        return -1;
    }

    // Optimal Approach (Boyer-Moore Voting Algorithm)
    public static int optimal(int[] nums) {
        int n=nums.length;
        int count =0;
        int element=0;
        for(int i=0;i<n;i++) {
            if (count==0) {
                element=nums[i];
                count=1;
            }
            else if (nums[i]==element) {
                count++;
            }
            else {
                count --;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int result=brute(nums);
        System.out.println(result);
        int nums1[] = {2,2,1,1,1,2,2};
        int result1=better(nums1);
        System.out.println(result1);
        int nums2[] = {2,2,1,1,1,2,2};
        int result2=optimal(nums2);
        System.out.println(result2);
    }
}
