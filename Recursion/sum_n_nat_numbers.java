package Recursion;

public class sum_n_nat_numbers {
    public static int sum(int n) {
        if (n==1) return 1;
        int sum=n+sum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int sum=sum(10);
        System.out.println(sum);
    }
}
