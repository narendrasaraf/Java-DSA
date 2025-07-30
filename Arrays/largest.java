
public class largest {
    public static void largest(int[] digit) {
        int largest =digit[0];
        for(int i=0;i<=digit.length-1;i++) {
            if (digit[i]>largest) {
                largest = digit[i];
            }
        }
        System.out.println("Largest number in array is: "+largest);
    }
    public static void main(String[] args) {
        int [] digits ={1,6,3,8,67,477,2,5};
        largest(digits);
    }
}
