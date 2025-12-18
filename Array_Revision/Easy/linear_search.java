package Array_Revision.Easy;

public class linear_search {
    public static int linearsearch(int nums[],int key) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if (nums[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int result=linearsearch(nums, 5);
        System.out.println("Element found at index: "+result);
    }
}
