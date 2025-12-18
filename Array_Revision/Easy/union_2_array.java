package Array_Revision.Easy;

import java.util.*;

public class union_2_array {
    // Brute Force Approach
    public static void Brute(int nums1[], int nums2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }
        System.out.println(set);
    }

    // Optimal Approach
    // works only if 2 arrays are sorted
    public static void optimal(int nums1[], int nums2[]) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) {
                list.add(nums1[i]);
                i++;    
                }
                
            } else if (nums1[i] == nums2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]){
                list.add(nums1[i]);
                i++;
                j++;
                }
                
            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != nums2[j]) {
                list.add(nums2[j]);
                j++;
                }
                
            }
        }
        while (i < nums1.length) {
            if (list.get(list.size() - 1) != nums1[i])
                list.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            if (list.get(list.size() - 1) != nums2[j])
                list.add(nums2[j]);
            j++;
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 1,2, 3, 4, 5, 6, 7 };
        int nums2[] = { 4, 5, 6, 7, 8, 9, 10 };

        // Brute(nums1,nums2);
        optimal(nums1, nums2);
    }
}
