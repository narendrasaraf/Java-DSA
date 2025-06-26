package Loops;

import java.util.Scanner;

public class ForLoopExample {
	public static void main(String [] args) {

    // for loop example 

    // for(int i=0;i<100;i++){
    //     System.out.println("Count is:" + i);
    // }

    //Square Pattern  

    // for(int count=1;count<=4;count++){
    //     System.out.println("****");
    //     // System.out.println();
    // }

    // sum till a user inputed number

    // Scanner sc =new Scanner(System.in);
    // System.out.println("Enter number till which you want to sum the numbers:");
    // int end = sc.nextInt();
    // sc.close();
    // int sum=0;
    // for(int i=1;i<=end;i++) {
    //     sum=sum+i;
    //     System.out.println("Sum till "+i+" is: "+sum);
    // }

    //
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter number till which you want to sum the numbers:");
    int reverse = sc.nextInt();
    sc.close();
    

    System.out.println("Loop has ended.");
    }
}
