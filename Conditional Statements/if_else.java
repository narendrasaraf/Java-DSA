import java.util.Scanner;

public class if_else {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // boolean isMarried = sc.nextBoolean();
        sc.close();
        if (age<=18) {
            System.out.println("You are not eligible to vote and drive a car and marry.");
        }
        else if (age >18 && age <=21 ) {
            System.out.println("You are eligible to vote and drive a car but not eligible to marry.");
        }
        else {
            System.out.println("You are eligible to vote, drive a car, and marry.");
        }
    }
}