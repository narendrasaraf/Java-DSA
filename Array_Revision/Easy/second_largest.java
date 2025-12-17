package Array_Revision.Easy;

public class second_largest {
    public static void secondlargest(int nums[]) {
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if (nums[i]>largest) {
                second_largest=largest;
                largest=nums[i];
            }
            else if (nums[i] > second_largest && nums[i] != largest) {
                second_largest = nums[i];
            }
        }
        System.out.println(second_largest);
    }
    public static void main(String[] args) {
        int nums[]={1,4,3,-5,2};
        // largest(nums);
        secondlargest(nums);
    }
}
