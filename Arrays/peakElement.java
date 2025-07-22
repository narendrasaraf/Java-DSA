// Given an array arr of integers. 
// A peak element is defined as an element greater than both of its neighbors.
// Formally, if arr[i] is the peak element, arr[i - 1] < arr[i] and arr[i + 1] < arr[i].

package Arrays;
import java.util.*;
public class peakElement {
    public static int findpeak(int[] nums) {
        for(int i=1;i<=nums.length;i++) {
            if (nums[i-1]<nums[i] && nums[i+1]<nums[i]) {
                System.out.println("Peak element is at index "+i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,9,6,7,8,5,1};
        findpeak(nums);
    }
}
