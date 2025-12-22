package String_TUF.Easy;

public class reverse_words {
    public static String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) != ' ') {
                word.append(sb.charAt(i));
            } else {
                if (word.length() > 0) {
                    word.reverse();
                    ans.append(word).append(" ");
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            word.reverse();
            ans.append(word);
        } else {
            if (ans.length() > 0)
                ans.setLength(ans.length() - 1);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "hello world";
        String result = reverseWords(s);
        System.out.println(result);
    }
}
