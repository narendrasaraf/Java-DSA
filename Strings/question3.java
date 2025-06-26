package Strings;

public class question3 {
    public static void question3(String str []) {
        int test = Integer.MIN_VALUE;
        for (int i = 0; i < str.length-1; i++) {
            int n = 0;
            n++;
            if (n > test) {
                test = n;
            }
        }
        System.out.println("The length of the longest string is: " + test);
    }

    public static void main(String[] args) {
        String str [] ={"Narendra","Saraf","VIT"} ;
        question3(str);
    }
}
