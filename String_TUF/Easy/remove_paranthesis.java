package String_TUF.Easy;

public class remove_paranthesis {
    public static String removeparanthesis(String str) {
        StringBuilder sb=new StringBuilder();
        int depth=0;
        for(char ch: str.toCharArray()) {
            if (ch=='(') {
                if (depth>0) {
                    sb.append(ch);
kqo

                }
                depth++;
            } 
                else {
                depth--;
                if (depth>0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="(()())(())(()(()))";
        String result=removeparanthesis(str);
        System.out.println(result);
    }
}
