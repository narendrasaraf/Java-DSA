package BackTracking;

public class count_good_numbers {
    public int countGoodNumbers(long n) {
        long mod = 1000000007;
        long even = (n + 1) / 2;
        long odd = n / 2;
        long ans = 1;
        for (int i = 0; i < even; i++) {
            ans = (ans * 5) % mod;
        }
        for (int i = 0; i < odd; i++) {
            ans = (ans * 4) % mod;
        }
        return (int) ans;
        
    }
}
