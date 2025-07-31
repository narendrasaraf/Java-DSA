import java.util.HashMap;

public class max_nums1 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i : nums) {
            // get or default --> get value if not present return default 0
            if (map.getOrDefault(nums[i], 0) > majority) {
                return i;
            }
        }
        return -1;
    }

    public int optimal(int[] nums) {
        int Element = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                Element = nums[i];
                count = 1;
            } else if (nums[i] == Element) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int j = 0; j < nums.length; j++) {
            if (Element == nums[j]) {
                count1++;
            }
            if (count1 > (nums.length / 2)) {
                return Element;
            }
        }
        return -1;
    }
}