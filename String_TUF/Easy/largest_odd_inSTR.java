package String_TUF.Easy;

public class largest_odd_inSTR {
    public static String largestodd(String s) {
        int max=Integer.MIN_VALUE;
        // int s1=Integer.parseInt(s);
        for(int i : s.toCharArray()){
            int digit=Character.getNumericValue(i);
            if(digit%2!=0) {
                if(digit>max) {
                    max=digit;
                }
            }
            else {
                for(int j=0;j<s.length();j++) {
                
                    String s1=s.substring(i);
                    int num=Integer.parseInt(s1);
                    if(num%2!=0 && num>max) {
                        max=num;
                    }
                
            }
                continue;
            }
        }
        return Integer.toString(max);
    }
    public static void main(String[] args) {
        String s="12345678";
        System.out.println(largestodd(s));
    }
}
