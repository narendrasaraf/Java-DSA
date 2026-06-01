package Recursion;
// Print number from n to 1
public class intro {
    public static void decorder(int n) {
        if (n==1) {
        System.out.println(n);
        return;
        }

        System.out.print(n+" ");
        decorder(n-1);
    }

    public static void incorder(int n) {
        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        incorder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        decorder(10);
        decorder(1);
        // System.out.println();
        // PrintInc(1, 20);

        incorder(5);
        System.out.println();
        incorder(1);
    }
}
