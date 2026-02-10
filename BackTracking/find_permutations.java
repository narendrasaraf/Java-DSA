package BackTracking;

public class find_permutations {
    public static void findpermutation(String str,String ans) {
        // base case 
        if(str.length()==0) {
            System.out.println(ans);
            return;
        }
        // Recursive case 
        for(int i=0;i<str.length();i++) {
            char cur=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            findpermutation(newstr, ans+cur);
        }
    }
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        findpermutation(str, "");
    }
}
