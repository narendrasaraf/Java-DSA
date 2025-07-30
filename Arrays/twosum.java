import java.util.*;

public class twosum {
    public static int[] twoSum(int[] nums, int target) {
        // int arr[]=new int[2];
        // for(int i=0;i<nums.length;i++) {
        //     for(int j=1;j<nums.length;j++) {
        //         if(nums[i]+nums[j]==target) {
        //             arr[0]=i;
        //             arr[1]=j;
        //             return arr;
        //         }
        //     }
        // }
        // arr[0]=-1;
        // arr[1]=-1;
        
        // return arr;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }

        // Two Pointer Approach -- Optimal

        int lp=0;
        int rp=nums.length-1;

        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        while (lp<rp) {
            int temp=nums[lp]+nums[rp];
            if (temp==target) {
                int t1=map.get(nums[lp]);
                int t2=map.get(nums[rp]);
                arr[0]=t1;
                arr[1]=t2;
                return arr;
            }
            else if (temp<target) {
                lp++;
            } else {
                rp--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,8,9};
        int arr1[]=twoSum(arr,14);
        // System.out.println(twoSum(arr,14));
        for (int i : arr1) {
            System.out.print(i);
        }
        
    }
}