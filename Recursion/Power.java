package Recursion;

public class Power {
    public static int power(int x,int n) {
        if (n==0) return 1;
        return x*power(x, n-1);
    }
    public static int optimal(int x, int n) {
        if(n==0) return 1;
        if (n%2==0) {
            return optimal(x*x, n/2);
        }
        else {
            return x*optimal(x, n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(power(4, 2));
        System.out.println(optimal(4, 2));
    }
}
