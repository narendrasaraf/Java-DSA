import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;
import java.util.*;

public class LeadersInArrays {

    // Brute Force Solution --->

    public static void brute(int[] nums) {
        // int[] result={};
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    // Optimal Solution

    public static void optimal(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        ArrayList<Integer> leaders = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                leaders.add(nums[i]); // Store leader
            }
        }

        Collections.reverse(leaders);
        System.out.println(leaders);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 1 };
        brute(arr);
        optimal(arr);
    }
}
