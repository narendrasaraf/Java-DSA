package Array_Revision.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    public static int[] brute(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] better(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int needed = target-nums[i];
            if(map.containsKey(needed)) {
                return new int[] {map.get(needed),i};
            }
        map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static int[] optimal(int[] nums, int target) {
        int lp=0;
        int rp=nums.length-1;
        // Arrays.sort(nums);
        while (lp<=rp){
            int temp=nums[lp]+nums[rp];
            if (temp == target) {
                return new int[]{lp,rp};
            }
            else if (temp<target) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return new int [] {-1,-1};
}
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 26;
        // int result[]=brute(nums, target);
        // for(int i:result){
        //     System.out.println(i+" ");
        // }
        int result2[]=optimal(nums, target);
        for(int i:result2){
            System.out.println(i+" ");
        }
    }
}
