package Strings;

public class uppercase {
    public static String uppercase(String str) {
        String upperstr="";
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z') {
                ch=(char)(ch-32);
                upperstr=upperstr+ch;
            }
        }
        return upperstr;
    }
    public static void main(String[] args) {
        String str=uppercase("narendra");
        System.out.println(str);
    }
}
