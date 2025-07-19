package Recursion;

public class factorial {
    public static int factorial(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}