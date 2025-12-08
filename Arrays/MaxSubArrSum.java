
public class MaxSubArrSum {
    public static void BruteFprce(int[] arr) {
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++) {
            for(int j=i;j<=arr.length-1;j++) {
                int curr=0;
                for(int k=i;k<=j;k++) {
                    curr=curr+arr[k];
                    if (Max<curr) {
                        Max=curr;
                    }
                }
                // System.out.print(")");
                System.out.println();
            }
        }
        System.out.println("Maximum Subarray Sum = " + Max);
        
    }
    public static int Better(int[] arr) {
        int Maxi=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++) {
            int sum=0;
            for(int j=i;j<=arr.length-1;j++) {
                sum=sum+arr[j];
                Maxi= Math.max(Maxi, sum);
            }
        }
        return Maxi;
    }

    public static int optimal(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum=sum+nums[i];       
            if (sum>max) {
                max=sum;
            }
            if (sum<0) {
                sum=0;
            }
            if (max<0) {
                max=0;
            }
        }
        System.out.println(max);
        return max;
    }
public static void main(String[] args) {
    int [] arr={1,2,3,4,5};
    int [] arr1={-1,-2,-3,-4,-5};
    
    // MaxSum(arr);
    optimal(arr);
    optimal(arr1);
}
}
