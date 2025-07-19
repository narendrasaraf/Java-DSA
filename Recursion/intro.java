package Recursion;
// Print number from n to 1
public class intro {
    public static void PrintNum(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        
        System.out.print(n+" ");
        PrintNum(n - 1);
    }
    public static void PrintInc(int n,int target) {
        if (n==target) {
            return;
        }
        System.out.print(n+" ");
        PrintInc(n+1, target);
    }
    public static void main(String[] args) {
        PrintNum(10);
        System.out.println();
        PrintInc(1, 20);
    }
}
