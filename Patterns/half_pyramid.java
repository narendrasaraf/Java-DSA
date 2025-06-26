package Patterns;

    import java.util.*;
    
    public class half_pyramid {
        public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number till which you want to print the pattern:");
        int end=sc.nextInt();
        System.out.println("Half Pyramid Pattern:");
        sc.close();
        for(int i=1;i<=end;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
