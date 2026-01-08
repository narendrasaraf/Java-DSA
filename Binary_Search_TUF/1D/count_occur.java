public class count_occur {
    public static int brute(int[] nums,int target) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++) {
            if (nums[i]==target) {
                count++;
            }
        }
        return count;
    }

    public static int lowerbound(int[] nums, int target) {
    int low = 0;
    int high = nums.length-1;
    int ans=nums.length;

    while (low <= high) {
        int mid =(high+low)/2;

        if (nums[mid]>=target) {
            ans=mid;
            high = mid - 1;
        } else {
            low=mid+1;
        }
    }
        return ans; 
    }

    public static int upperbound(int[] nums, int target) {
    int low = 0;
    int high = nums.length-1;
    int ans=nums.length;

    while (low <= high) {
        int mid =(high+low)/2;

        if (nums[mid]>target) {
            ans=mid;
            high = mid - 1;
        } else {
            low=mid+1;
        }
    }
        return ans; 
    }
    // Optimal
    public static int optimal(int[] nums,int target) {
        int lower=lowerbound(nums, target);
        int upper=upperbound(nums, target);
        if (lower==nums.length || nums[lower]!=target) {
            return 0;
        }
        return upper-lower;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,2,3,4,5};
        int target=2;
        // int result=brute(nums,target);
        int result2=optimal(nums,target);
        // System.out.println(result);
        System.out.println(result2);
    }
}
