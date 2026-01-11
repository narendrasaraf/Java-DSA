package Binary_Search_TUF.BS_Answer;

public class koko_banana {
    public static int minEatingSpeed(int[] piles,int h) {
        int low=1;
        int high=maxPile(piles);
        int ans=high;
        while(low<=high) {
            int mid=low+(high-low)/2;
            int hoursNeeded=calculateHours(piles,mid);
            if(hoursNeeded<=h) {
                ans=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return low;
    }
    public static long calculateHours(int[] piles,int hourly) {
        long hours=0;
        for(int pile:piles) {
            hours=hours+(int)Math.ceil((double)pile/hourly);
        }
        return hours;
    }
    public static int maxPile(int[] piles) {
        int max=Integer.MIN_VALUE;
        for(int pile:piles) {
            if(pile>max) {
                max=pile;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] piles={30,11,23,4,20};
        int h=6;
        System.out.println(minEatingSpeed(piles,h));
    }
}
