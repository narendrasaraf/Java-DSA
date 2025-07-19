package Recursion;

public class firstoccur {
    public static int occurance(int[] nums, int key) {
        int index=nums.length-1;
        if (nums[index] == key) {
            return index;
        }
        index++;
        return occurance(nums, key);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8};
        System.out.println(occurance(nums, 3));
    }
}
