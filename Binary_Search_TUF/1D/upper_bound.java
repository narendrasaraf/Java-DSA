// package Binary_Search_TUF.1D;

public class upper_bound {
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
}
