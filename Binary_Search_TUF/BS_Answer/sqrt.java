package Binary_Search_TUF.BS_Answer;

public class sqrt {
    public static int optimal(int n) {
        int low=0;
        int high=n;
        int ans=0;
        if(n==0 || n==1) return n;
        while(low<=high) {
            int mid=(low+high)/2;
            int temp=mid*mid;

            if(temp<=n) {
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }

        return ans;
    }
    public static void main(String[] args) {
        int n=50;
        System.out.println(optimal(n));
    }
}