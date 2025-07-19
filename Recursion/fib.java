package Recursion;

public class fib {
    public static int fib(int n) {
        if (n==1 || n==0) {
            return n;
        }
        int fm1=fib(n-1);
        int fm2=fib(n-2);
        int fibo =fm1+fm2;
        return fibo;
    }
    public static void main(String[] args) {
        System.out.println(fib(50));
    }
}
