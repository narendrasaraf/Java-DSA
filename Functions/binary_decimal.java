package Functions;

public class binary_decimal {
    public static int binarydecimal(int binary) {
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(binarydecimal(101)); // 5
        System.out.println(binarydecimal(111)); // 7
        System.out.println(binarydecimal(1));   // 1 (not 001)
        System.out.println(binarydecimal(100)); // 4
        System.out.println(binarydecimal(10));  // 2 (not 010)
    }
}
