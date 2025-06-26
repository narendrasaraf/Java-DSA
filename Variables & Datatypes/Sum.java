import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int product = a*b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The product of " + a + " and " + b + " is: " + product);

        int r=sc.nextInt();
        float area=3.4f*r*r;
        System.out.println("The area of circle with radius " + r + " is: " + area);
    }
}
