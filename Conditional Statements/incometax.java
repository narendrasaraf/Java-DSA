// package Conditional Statements;
import java.util.Scanner;

public class incometax {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs:");
        float income = sc.nextFloat();
        sc.close();
        if (income <=5) {
            System.out.println("Your income is tax-free.");
        }
        else if (income >5 && income<=10 ) {
            int tax = (int)(income + income*0.2);
            System.out.println("Your tax is: " + tax + "");
        }
        else if (income >10) {
            int tax = (int)(income + income*0.3);
            System.out.println("Your tax is: " + tax);
        }
    }
}
