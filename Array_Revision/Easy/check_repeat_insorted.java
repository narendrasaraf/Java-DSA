package Array_Revision.Easy;
// Two pointer approach
public class check_repeat_insorted {
    public static void checkrepeat(int nums[]) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if (nums[j]!=nums[i]) {
                i++;
                nums[i]=nums[j];
            }
        }
        for(int k=0;k<=i;k++) {
            System.out.print(nums[k]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,4,4};
        checkrepeat(nums);
        
    }
}
