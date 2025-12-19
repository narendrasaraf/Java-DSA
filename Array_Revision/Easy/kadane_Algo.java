package Array_Revision.Easy;

public class kadane_Algo {
    public static int optimal(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currsum = currsum + nums[i];
            if (currsum > maxsum) {

                maxsum = currsum;
            }
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }

    public static int withindex(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int startindex = 0;
        int endindex = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currsum == 0) {
            }
            currsum = currsum + nums[i];
            if (currsum > maxsum) {
                maxsum = currsum;
                startindex = start;
                endindex = i;
            }
            if (currsum < 0) {
                currsum = 0;
                start = i + 1;
            }
        }
        return maxsum;
    }
}
