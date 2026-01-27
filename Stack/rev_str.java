import java.util.*;
public class rev_str {
    public static String reverseStr(String str) {
        Stack<Character>s=new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder();
        while (!s.isEmpty()) {
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String result=reverseStr("NARENDRA");
        int idx=0;
        while (idx<result.length()) {
            System.out.print(result.charAt(idx));
            idx++;
        }
    }
}
