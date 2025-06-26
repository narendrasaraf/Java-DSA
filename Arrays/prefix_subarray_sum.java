package Arrays;

import java.util.*;

public class prefix_subarray_sum {
    public static void prefixsum(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int[] prefix =new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<=arr.length-1;i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.println("Prefix Sum Arrary: "+Arrays.toString(prefix));
        int sum=0;
        for(int i=1;i<=arr.length;i++) {
            for(int j=i;j<=arr.length;j++) {
                currSum=prefix[j]-prefix[i-1];
                if(currSum>maxSum) {
                    maxSum=currSum;
                    System.out.println("Sum of subarray from index to is: "+currSum);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={111,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        // prefixsum(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
