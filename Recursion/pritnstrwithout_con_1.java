package Recursion;

public class pritnstrwithout_con_1 {
    public static void print(String str,int index) {
        if (index==str.length()) return;
        if (str.charAt(index)=='c' || str.charAt(index)=='o') {
            print(str, index+1);
        }
        else {
            System.out.print(str.charAt(index));
            print(str, index+1);
        }
    }
    public static void main(String[] args) {
    }
}
