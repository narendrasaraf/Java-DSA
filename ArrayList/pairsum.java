package ArrayList;
import java.util.*;
public class pairsum {
    public static void pairSum(ArrayList<Integer> list,int target) {
        // int sum=target;
        int x=0;
        int lp=0;
        int rp=list.size()-1;

        while (lp<rp) {
            int sum=list.get(lp)+list.get(rp);
            if (target==sum) {
                System.out.println("Targeted key found at index "+list.get(lp)+" and "+list.get(rp));
                break;
            } else if(target>sum) {
                lp++;
            }else{
                rp--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        pairSum(list, 8);
    }
}
