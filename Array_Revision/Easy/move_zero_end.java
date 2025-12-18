package Array_Revision.Easy;

public class move_zero_end {
    // Brute Force Approach
    public static void moveZeroes_Brute(int[] nums) {
        int n = nums.length;
        int temp[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++) {
            if (nums[i]!=0) {
                temp[count++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    } 

    // Optimal Approach
    public static void moveZeroes(int nums[]) {
        int n=nums.length;
        int j=-1;
        for(int i=0;i<n;i++) {
            if (nums[i]==0) {
                j=i;
                break;
            }
        }
        if (j == -1) return;

        for(int i=j+1;i<n;i++) {
            if (nums[i]!=0) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        // int nums []={0,1,0,3,12};
        // moveZeroes_Brute(nums);
        // // for(int i:nums){
        //     //     System.out.print(i+" ");
        //     // }
        int nums1 []={20,1,10,3,12};
        moveZeroes(nums1);
        for(int i:nums1){
            System.out.print(i+" ");
        }
    }
}
