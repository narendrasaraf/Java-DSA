
import java.util.Arrays;
public class update {
    public static void updateArray(int[] marks) {
        for (int i = 0;i<=marks.length-1;i++) {
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int [] marks = {97,98,95,96};
        for (int i = 0;i<=marks.length-1;i++) {
            System.out.println("Before update: "+marks[i]+" ");
        }
        updateArray(marks);
        for (int i = 0;i<=marks.length-1;i++) {
            System.out.println("After update: "+marks[i]+" ");
        }
    }
}