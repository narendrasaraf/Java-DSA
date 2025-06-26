package Arrays;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int [] Marks =new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of student:");
        Marks[0]=sc.nextInt();
        Marks[1]=sc.nextInt();
        Marks[2]=sc.nextInt();
        System.out.println("Physics marks: "+Marks[0]);
        System.out.println("Math marks: "+Marks[1]);
        System.out.println("Chemistry marks: "+Marks[2]);

    Marks[1]=Marks[1]+30;
        System.out.println("Math marks: "+Marks[1]);
        System.out.println(Marks.length);
    }
}
