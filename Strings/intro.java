package Strings;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String("Narendra");
        String str1="Saraf";

        System.out.println(str);
        System.out.println(str1);

        // String str2=sc.next();
        // System.out.println("Entered Name is: "+str2);
        String str3=sc.nextLine();
        System.out.println("Entered Line is: "+str3);
        System.out.println("Length of String is: "+str3.length());
    }
}
