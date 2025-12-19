package Array_Revision.Easy;

public class longest_sub_with_sum_k {
    public static void brute(int nums[],int k) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            int sum=0;
            int curr=0;
            System.out.println(nums[i]);
            for(int j=i+1;j<nums.length;j++) {
                for (int l=i;l<=j;l++) {
                    System.out.print(nums[l]+" ");
                    sum=sum+nums[l];
                    max=Math.max(max, sum);
                }
                System.out.println();
            }
        }
    }

    // Kadane Algoritm
    public static int optimal(int[] nums,int k) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            currsum=currsum+nums[i];
            if (currsum>maxsum) {
                
                maxsum=currsum;
            }
            if(currsum<0) {
                currsum=0;
            }
            }
            return maxsum;
        }
    public static void main(String[] args) {
        int nums[] = {1,-2,3,7,5};
        int k=12;
        int result=optimal(nums,k);
        System.out.println(result);
        // brute(nums,k);
    }
}
