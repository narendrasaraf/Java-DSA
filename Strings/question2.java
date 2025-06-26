package Strings;
import java.util.*;
public class question2 {
    public static float question(String str) {
        int x=0;
        int y=0;

        for(int i=0;i<str.length();i++) {
            if (str.charAt(i)=='N') {
                y++;
            }
            else if (str.charAt(i)=='E') {
                x++;
            }
            else if(str.charAt(i)=='S') {
                y--;
            }
            else {
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        float shortestPath=(float)Math.sqrt(X2+Y2);
        System.out.println("Shortest Path is: "+shortestPath);
        return shortestPath;
    }
    public static void main(String[] args) {
        String str="WNEENESENN";
        question(str);
    }
}
