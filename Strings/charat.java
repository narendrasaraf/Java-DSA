package Strings;

public class charat {
    public static void Example(String str) {
        for(int i=0;i<=str.length();i++) {
            System.out.println(str.charAt(i)+" "+i+" ");
        }
    }
    public static void main(String[] args) {
        String str1="Narendra";
        String str2="Saraf";
        String str=str1+" "+ str2;
        // System.out.println(str);
        Example(str);
    }
}
