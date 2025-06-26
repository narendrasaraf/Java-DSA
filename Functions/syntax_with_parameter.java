package Functions;
import java.util.*;
public class syntax_with_parameter {

    public static int sum(int a,int b) {
        int c = a+b;
        System.out.println("The sum of " + a + " and " + b + " is: " + c);
        return c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        sc.close();
        sum(a,b);
    }
}
