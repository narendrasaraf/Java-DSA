package ArrayList;
import java.util.*;
public class mostwater {
    public static int storewater(ArrayList<Integer> list) {
        int maxWater=0;
        int lp=0;
        int rp=list.size()-1;

        while (lp<rp) {
            int height =Math.min(list.get(rp),list.get(lp));
            int width = rp-lp;
            int area =height*width;
            maxWater=Math.max(maxWater, area);
        }
        if (list.get(rp)>list.get(lp)) {
            rp++;
        } else {
            lp--;
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        // System.out.println(list);
        // int maxArea =Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++) {
        //     for (int j=i+1;j<list.size();j++) {
        //         int height = Math.min(list.get(i), list.get(j));
        //         int width =j-i;
        //         int area = height*width;

        //         if (area > maxArea) {
        //             maxArea=area;
        //         }
        //     }
        // }
        // System.out.println("Maximum water stored is "+maxArea);
        storewater(list);
    }
    
}
