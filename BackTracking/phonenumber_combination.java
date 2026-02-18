package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class phonenumber_combination {
    // Global declaration
    List<String>result=new ArrayList<>();

    public static String[] map= {
        "" ,
        "" ,
        "abc" ,
        "def" ,
        "ghi" ,
        "jkl" ,
        "mno" ,
        "pqrs" ,
        "tuv" ,
        "wxyz" 
    };
    public void backtrack(String digits,String current,int index) {
        // base case
        if(index == digits.length()) {
            result.add(current);
            return;
        }
        // for 
        String letters =map[digits.charAt(index)-'0'];
        for (int i = 0; i < letters.length(); i++) {
            // Choose
            current += letters.charAt(i);
            // Explore
            backtrack(digits, current, index + 1);
            // Unchoose
            current = current.substring(0, current.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {

        if(digits.length() == 0)
            return result;

        backtrack(digits, "", 0);

        return result;
    }
    public static void main(String[] args) {
        String digits="23";
        phonenumber_combination obj=new phonenumber_combination();
        List<String> combinations=obj.letterCombinations(digits);
        System.out.println(combinations);
    }
}
