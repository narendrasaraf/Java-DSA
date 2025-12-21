package Array_Revision.Medium;

public class next_permutation {
    public static void swap(int[] nums,int a,int b) {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void reverse(int[] nums,int start,int end) {
        while(start<end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void brute(int[] nums) {
        int n=nums.length;
        int right=nums[0];
        int left=nums[1];

        for(int i=0;i<n;i++) {
            if (nums[right]>nums[i]) {
                left=nums[n-1];
                swap(nums, left, right);
            }

        }
    }
    public static void optimal(int[] nums) {
        int n=nums.length;
        int index=-1;

        for(int i=n-2;i>=0;i--) {
            if (nums[i]<nums[i+1]) {
                index=i;
                break;
            }
        }
        if (index==-1) {
            reverse(nums, 0, n-1);
            return;
        }
        for(int i=n-1;i>index-1;i--) {
            if (nums[i]>nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        reverse(nums, index+1,n-1);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        // brute(nums);
        // for(int i:nums) {
        //     System.out.print(i+" ");
        // }
        System.out.println();
        optimal(nums);
        for(int i:nums) {
            System.out.print(i+" ");
        }
    }
}