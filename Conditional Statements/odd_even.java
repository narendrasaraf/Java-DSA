// package Conditional Statements;

import java.util.Scanner;

public class odd_even {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        sc.close();
        if (num%2==0) {
            System.out.println("The Number is Even: " +num);
        }
        else {
            System.out.println("The Number is Odd: " +num);
        }
    }
}
