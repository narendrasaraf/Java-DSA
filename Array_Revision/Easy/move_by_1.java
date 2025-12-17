package Array_Revision.Easy;

public class move_by_1 {
    public static void moveby1(int nums[]) {
        int temp =nums[0];

        for(int i=0;i<nums.length-1;i++) {
            nums[i]=nums[i+1];

        }
        nums[nums.length-1]=temp;
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int nums []={1,2,3,4,5};
        moveby1(nums);
    }
}
