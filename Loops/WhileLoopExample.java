package Loops;

import java.util.Scanner;

// package Loops;

public class WhileLoopExample {
	public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int count = 1;
    // while (count<101) {
    //     System.out.println("count is:" + count); 
    //     count++;
    //     }

    // System.out.println("Enter a number to start the loop:");
    // int start = sc.nextInt();
    // System.out.println("Enter a number to end the loop:");
    // int end = sc.nextInt();
    // sc.close();

    
    // while (count <= end ) {
    //     System.out.println("count is:" + count); 
    //     count++;
    //     }
    
    // while (count <= 10 ) {
    //     System.out.println("count is:" + count); 
    //     count++;
    //     }
    // Scanner sc =new Scanner(System.in);
    System.out.println("Enter number till which you want to sum the numbers:");
    int reverse = sc.nextInt();
    sc.close();
    int n=reverse;
    while (n>0) {
        int last = n%10;
        System.out.print(last);
        n=n/10;
    }
    System.out.println();
    System.out.println("Loop has ended.");
    }
}

