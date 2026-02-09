package Recursion;

public class remove_duplicate_from_str {
    public static String remove(String str,int index) {
        if (index==str.length()-1) return str.charAt(index)+"";
        if (str.charAt(index)==str.charAt(index+1)) {
            return remove(str, index+1);
        }
        return str.charAt(index)+remove(str, index+1);
    }
    public static void main(String[] args) {
        String str="aaaaaaaaaabbbbbbbbbccccccccccccdddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffggggggggggggggggggghhhhhhhhhhhhhhhhhhhiiiiiiiiiiiiiiiiiijjjjjjjjjjjjjjjjjjkkkkkkkkkkkkkklllllllllllllllllmmmmmmmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnoooooooooooooooooppppppppppppppppppppqqqqqqqqqqqqqqqqqqqqqrrrrrrrrrrrrrrrrrrrssssssssssssssssssttttttttttttttttttttttttuuuuuuuuuuuuuuuuuuuuuuvvvvvvvvvvvvvvvvvvvvvvvwwwwwwwwwwwwwwwwwwwwwwxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyyyzzzzzzzzzzzzzzzzz";
        System.out.println(remove(str, 0));
    }
}
