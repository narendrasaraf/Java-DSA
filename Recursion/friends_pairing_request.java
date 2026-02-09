package Recursion;

public class friends_pairing_request {
    public static int friends(int n) {
        if(n==0||n==1||n==2) return n;
        int single=friends(n-1);
        int pair=(n-1)*friends(n-2); // 1 friend can pair with n-1 friends and then we have to find for n-2 friends
        return single+pair;
    }
    public static void main(String[] args) {
        System.out.println(friends(4));
    }
}
