import java.util.ArrayList;

public class rearange1by1 {
    public static int[] result(int[] nums) {
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        // ArrayList<Integer> Result=new ArrayList<>();
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if (nums[i]>0) {
                positive.add(nums[i]);
            }
            if (nums[i]<0) {
                negative.add(nums[i]);
            }
        }
        for(int i=0;i<positive.size();i++) {
            result[2*i+1]=negative.get(i);
            result[2*i]=positive.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,-2,-3,4,-5,-6,7,8,-9,10};
        for (int i : result(arr)) {
            System.out.print("["+i+"]");
        }
    }
}
