package Patterns;

import java.util.Scanner;

public class star {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number till which you want to print the star pattern:");
        int end=sc.nextInt();
        sc.close();
        for(int i=1;i<=end;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
