package Array_Revision.Easy;

import java.security.Key;

public class SingleNumber {
    // Brute Force Approach
    public static int brute(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int count=0;
            for(int j=0;j<nums.length;j++) {
                if (nums[i]==nums[j]) {
                    count++;
                }
            }
            if (count==1) {
                return nums[i];
            }
        }
        return -1;
    }
    public static int optimal(int[] nums) {
        //    Key property:
        //       x ^ x = 0
        //       x ^ 0 = x
        int ans=0;
        for(int i=0;i<nums.length;i++) {
            ans=ans^nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {4,4,1,2,1,2,5};
        int result=brute(nums);
        System.out.println(result);
        int nums1[] = {4,4,1,2,1,2,5};
        int result1=optimal(nums1);
        System.out.println(result1);
    }
}
