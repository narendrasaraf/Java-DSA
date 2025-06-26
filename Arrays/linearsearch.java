package Arrays;

import java.util.Scanner;

public class linearsearch {
    public static void LinearSearch(int[] marks,int key) {
        for(int i=0;i<=marks.length-1;i++) {
            if (key==marks[i]) {
                System.out.println("Key found at index: "+i);
            }
        }
    }
    public static void main(String[] args) {
        int [] marks = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of student:");
        for(int i=0;i<=marks.length-1;i++) {
            marks[i]=sc.nextInt();
        }
        // System.out.println(LinearSearch(marks));
        LinearSearch(marks,98);
        }
}
