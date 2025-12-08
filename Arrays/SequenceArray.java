// import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class SequenceArray {
    public static void brute(int[] nums) {
        if (nums.length == 0) {
            System.out.println(0);
            return;
        }

        Arrays.sort(nums);
        int mLen = 1;
        int cLen = 1;

        for (int i = 1; i < nums.length; i++) {
            // Skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                cLen++;
            } else {
                mLen = Math.max(mLen, cLen);
                cLen = 1;
            }
        }

        mLen = Math.max(mLen, cLen);
        System.out.println(mLen);
    }

    public static void optimal(int[] nums) {
        // Hashset method
        HashSet<Integer>set=new HashSet<>();
        for (Integer integer : nums) {
            set.add(integer);
        }
        // if () {
            
        // }
    }

    public static void main(String[] args) {
        int[] nums = {100, 4,4,4,4,4, 200, 1, 3, 2};
        brute(nums);
        optimal(nums);
    }
}
