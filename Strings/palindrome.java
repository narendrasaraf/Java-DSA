package Strings;

public class palindrome {
    public static boolean palindromeCheck(String str) {
        int n=str.length();
        for(int i=0;i<=str.length()/2;i++) {
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                // System.out.println(str+" :is a Palindrome");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abcderrdcba";
        System.out.println(palindromeCheck(str));
    }
}
