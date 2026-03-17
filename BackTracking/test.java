public class RecursionTest {

    public static void printNumbers(int n) {
        // Base case (very important)
        if (n == 0) {
            return;
        }

        // Recursive call
        printNumbers(n - 1);

        // Work after recursion (unwinding phase)
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}
