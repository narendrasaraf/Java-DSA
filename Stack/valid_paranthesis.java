import java.util.*;
public class valid_paranthesis {
    public static boolean isValid(String str) {
        Stack<Character>s=new Stack<>();
        for(int i=0;i<=str.length();i++) {
            char ch=str.charAt(i);
            if (ch=='(' || ch=='{' || ch=='[') {
                s.push(ch);
            }
            else {
                if(s.isEmpty()) return false;
                if ((s.peek() == '(' && ch==')') || (s.peek() == '{' && ch=='}') || (s.peek() == '[' && ch==']')) {
                    s.pop();
                }
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="(({{[[]]}}))";
        valid_paranthesis vp=new valid_paranthesis();
        vp.isValid(str);
    }
}
