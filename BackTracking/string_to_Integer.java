package BackTracking;
import java.util.*;

import Strings.charat;
public class string_to_Integer {
    public static int solution(String s) {
        int sign=1;
        int i=0;
        long result=0;
        if(s.length()==0) return 0;
        // Skipping whitespace
        while (i<s.length() && s.charAt(i)==' ') {
            i++;
        }
        if(s.length()==i) return 0;

        // sign
        if (i<s.length() && s.charAt(i)=='-') {
            sign=-1;
            i++;
        } else if (i<s.length() && s.charAt(i)=='+') {
            i++;
        }
        // conversion

        while (i<=s.length() && Character.isDigit(s.charAt(i))) {
            // to convert in digit we need to - '0' from char
            int digit=s.charAt(i)-'0';


            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {

                if (sign == 1) {
                    return 2147483647;
                } else {
                    return -2147483648;
                }
            }
            result=result*10+digit;
            i++;
        }
        return (int)(result*sign);
    }
}
