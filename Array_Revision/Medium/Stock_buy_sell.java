package Array_Revision.Medium;

// Space optimization is very important in this problem
// We can not use extra space of O(n) as in other problems

public class Stock_buy_sell {
    public static int brute(int[] nums) { 
        int n=nums.length;
        // int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if (nums[j]>nums[i]) {
                    maxprofit=Math.max(maxprofit, nums[j]-nums[i]);
                }
            }
        }
        return maxprofit;
    } // TC-O(n^2) SC-O(1)

    // Optimal Approach
    public static int optimal(int[] nums) {
        int n=nums.length;
        int mini=nums[0];
        int maxprofit=0;
        int profit=0;
        for(int i=1;i<n;i++) {
            profit=nums[i]-mini;
            maxprofit=Math.max(maxprofit, profit);
            mini=Math.min(nums[i], mini);

        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,3,5,3,6,4};
        int result=brute(prices);
        System.out.println(result);
        int result1=optimal(prices);
        System.out.println(result1);
    }
}
