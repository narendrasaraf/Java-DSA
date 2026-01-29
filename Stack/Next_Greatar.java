import java.util.*;

public class Next_Greatar {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>s=new Stack<>();
        int[]nextGreater=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--) {
            while (!s.isEmpty() && s.peek()<=nums[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i]=-1;
            }
            else {
                nextGreater[i]=s.peek();
            }
            s.push(nums[i]);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int[] nums={6,8,0,1,3};
        Next_Greatar obj = new Next_Greatar();
        int[] result = obj.nextGreaterElements(nums);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
