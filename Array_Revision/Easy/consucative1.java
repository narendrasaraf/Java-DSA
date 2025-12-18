package Array_Revision.Easy;

public class consucative1 {
    public static void consucative(int nums[]) {
        int curr=0;
        int max=0;

        for(int i=0;i<nums.length;i++) {
            if (nums[i]==1) {
                curr++;
                max=Math.max(max, curr);
            }
            else {
                curr =0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        // int nums[] = {1,1,0,1,1,1,1,1,1,1,0,0,1,1};
        int nums[] = {1};
        consucative(nums);
    }
}
