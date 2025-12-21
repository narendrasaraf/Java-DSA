package Array_Revision.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class longest_consecutive {
    // Better solution using sorting not brute force
    public static ArrayList<Integer> brute(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums[i]) {
                    list.add(nums[i]);
                }
            }
        }
        if (!list.isEmpty()) {
            list.add(list.get(list.size() - 1) + 1);
        }
        return list;
    }

    // Optimal Solution
    public static int optimal(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int longest = 0;
        for(int x:set) {
            if (!set.contains(x - 1)) {
                int current = x;
                int count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int nums[] = { 100, 4, 200, 1, 3, 2 };
        ArrayList<Integer> list1 = brute(nums);
        System.out.println(list1);
        int result = optimal(nums);
        System.out.println(result);
    }
}
