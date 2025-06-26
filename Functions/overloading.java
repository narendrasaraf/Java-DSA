package Functions;

public class overloading {
    
    public static int multiply(int a,int b) {
        return a*b;
    }
    public static int multiply(float a,float b) {
        return (int)(a*b);
    }
    public static int multiply(float a,int b) {
        return (int)(a*b);
    }
    public static int multiply(int a,float b) {
        return (int)(a*b);
    }

    public static void main(String[] args) {
        System.out.println(multiply(2, 3)); // int, int
        System.out.println(multiply(2.5f, 3.5f)); // float, float
        System.out.println(multiply(2.5f, 3)); // float, int
        System.out.println(multiply(2, 3.5f)); // int, float
    }
}
