package Loops;

import java.util.*;

public class DoWhileLoopExample {
	public static void main(String [] args) {
    int count = 1;
    Scanner sc= new Scanner(System.in);
    // for(int i=0;i<100;i++){
    //     System.out.println("Count is:" + i);
    // }
    // do {
    //     System.out.println("Count is: " + count);
    //     count++;
    // } while (count <= 100);
    // System.out.println("Loop has ended.");
    // }
    int neww;
    do {
        neww = sc.nextInt();
        System.out.println("You entered: " + neww);
    } while(neww%10!=0);
    System.out.println("Loop has ended.");
    
    }
}
