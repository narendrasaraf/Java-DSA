package BackTracking;

public class string_to_Integer {
    public static void solution(String s) {
        int sign=1;
        int i=0;
        while (i<s.length() && s.charAt(i)==' ') {
            i++;
        }
        if (i<s.length() && s.charAt(i)=='-') {
            sign=-1;
            i++;
        }

    }
}
