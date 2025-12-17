package Array_Revision.Easy;
import java.util.*;
public class move_by_x {

    public static void reverse(int nums[], int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Brute Force Approach
    public static void leftmove_brute(int nums[],int x) {
        int n= nums.length;
        x=x%n;
    // Storing first x elements temperorarily
        int temp[]=new int[x];
        for (int i=0;i<x;i++){
            temp[i]=nums[i];
        }
    // Shifting element left by x
        for(int i=0;i<n-x;i++) {
            nums[i]=nums[i+x];
        }
    // putting temp elements back in original after shifting
        for(int i=n-x;i<n;i++) {
            nums[i]=temp[i-(n-x)]; //temp[0],temp[1],... 
        }
    }

    // Optimal Approach
    //  1 2 3 4 5 6 7 ------> k=3
    //  3 2 1     4 5 6 7
    //  3 2 1     7 6 5 4    
    //  4 5 6 7 1 2 3


    public static void leftshift_optimal(int nums[],int x) {
        int n= nums.length;
        x=x%n;

        reverse(nums,0,x-1);
        reverse(nums,x,n-1);
        reverse(nums,0,n-1);
    }



    public static void main(String[] args) {
        int nums []={1,2,3,4,5,6,7};
        int x=3;
        leftmove_brute(nums,x);
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        int nums1 []={1,2,3,4,5,6,7};
        x=3;
        leftshift_optimal(nums1,x);
        for(int i:nums1){
            System.out.print(i+" ");
        }
    }
}