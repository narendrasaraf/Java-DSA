package Functions;

public class product {
    public static int product(int a,int b) {
        int c =a*b;
        System.out.println("The product of " + a + " and " + b + " is: " + c);
        return c;
    }
    public static void main(String[] args) {
        // Function call
        product(5,6);
        product(10,20);
    }
}
