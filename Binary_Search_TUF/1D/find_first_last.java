// package Binary_Search_TUF.1D;

public class find_first_last {
    public static int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int[] optimal(int[] nums, int target) {
        int n = nums.length;

        int first = lowerBound(nums, target);

        // target not found
        if (first == n || nums[first] != target) {
            return new int[]{-1, -1};
        }
        int last = upperBound(nums, target) - 1;
        return new int[]{first, last};
    }
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int result[]=optimal(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}