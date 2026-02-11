package BackTracking;

public class uniqueways_gridways {
    public static int uniquePaths(int m,int n) {
        // base case
        if(m==1 || n==1) {
            return 1;
        }
        return uniquePaths(m-1,n) + uniquePaths(m,n-1);
    }
    public static int optimal(int m,int n) {
        int numerator=factorial((m-1)+(n-1));
        int denominator=factorial(m-1)*factorial(n-1);
        return numerator/denominator;
    }
    public static int factorial(int n) {
        if (n==0) return 1;
        if(n<0) return -1;
        int fact=n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int m=3;
        int n=7;
        System.out.println(uniquePaths(m, n));
        System.out.println(optimal(m, n));
    }
}
