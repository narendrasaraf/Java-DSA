package Functions;

public class isPrime {
    public static boolean issPrime(int n) {
        if (n<=1) {
            return false;
        }
        for (int i=2;i<=n-1;i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(issPrime(2));
        System.out.println(issPrime(3));
        System.out.println(issPrime(4));
        System.out.println(issPrime(5));
        System.out.println(issPrime(6));
        System.out.println(issPrime(7));
        System.out.println(issPrime(8));
    }
}
