// package Conditional Statements;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a >=b && a>=c) {
            System.out.println("First Number is Largest:" + a);
        }
        else if (b>=a && b>=c){
            System.out.println("Second Number is Largest:" + b);
        }
        else  {
            System.out.println("Third Number is Largest:" + c);
        }
    }
}
