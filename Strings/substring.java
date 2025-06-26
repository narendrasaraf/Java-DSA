package Strings;

public class substring {
    public static String substring(String str,int si,int ei) {
        String substr="";
        for(int i=si;i<ei;i++) {
            substr=substr+str.charAt(i);
        }
        System.out.println("Req. substring is: "+substr);
        return substr;
    }
    public static void main(String[] args) {
        String str="Narendra Saraf";
        int si=2;
        int ei=8;
        substring(str, si, ei);
    }
}
