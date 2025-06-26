// package Conditional Statements;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        int age =25;
        String type =(age>18)?"Eligible to vote.":"Not eligible to vote.";
        System.out.println(type);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks:");
        int marks=sc.nextInt();
        sc.close();
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
