// package Conditional Statements;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a =sc.nextInt();
        int b =sc.nextInt();
        char operator = sc.next().charAt(0);
        sc.close();

        switch (operator) {
            case '+': System.out.println("Addition of"+a+"&"+b+" is: " + (a + b)); 
                    break;
            case '-': System.out.println("Substraction of"+a+"&"+b+" is:" + (a - b)); 
                    break;
            case '*': System.out.println("Multiplication of"+a+"&"+b+" is: " + (a * b)); 
                    break;
            case '/': System.out.println("Division of"+a+"&"+b+" is: " + (a / b)); 
                    break;
            case '%': System.out.println("Reminder of "+a+" & "+b+" is: " + (a % b)); 
                    break;
            default: System.out.println("Wrong Operator! Please enter a valid operator (+, -, *, /, %).");
                break;
        }
    }    
}
