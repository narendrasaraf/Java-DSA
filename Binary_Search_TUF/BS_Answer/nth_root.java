package Binary_Search_TUF.BS_Answer;

public class nth_root {
    public static int optimal(int n,int number) {
        int low=1;
        int high=number;
        int ans=0;
        if(n==0 || n==1) return number;
        while (low<=high) {
            int mid=(low+high)/2;
            long result = 1; 
            for(int i=0;i<n;i++) {
            result=result*mid;
            }
            if (result == number) return mid;
            else if (result < number) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=3;
        int number=81;
        System.out.println(optimal(n,number));
    }
}