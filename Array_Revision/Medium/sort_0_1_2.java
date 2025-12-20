package Array_Revision.Medium;

import java.util.Arrays;

public class sort_0_1_2 {
    // Brute Force Approach

    // Arrays.sort(nums);

    // Better Force Approach
    public static void sort(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i : nums) {
            if (i == 0) {
                zero++;
            }
            if (i == 1) {
                one++;
            }
            if (i == 2) {
                two++;
            }
        }
        int index = 0;
        while (zero-- > 0) {
            nums[index++] = 0;
        }
        while (one-- > 0) {
            nums[index++] = 1;
        }
        while (two-- > 0) {
            nums[index++] = 2;
        }
    }

    // optimal approach
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void optimal(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid,low);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 0, 1, 2, 0, 1, 1, 0 };
        // sort(nums);
        optimal(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
