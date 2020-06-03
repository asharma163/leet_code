package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        char[] _s = s.toCharArray();
        char[] _t = t.toCharArray();
        Arrays.sort(_s);
        Arrays.sort(_t);
        String s_new = new String(_s);
        String t_new = new String(_t);
        System.out.println(s_new);
        System.out.println(t_new);
        boolean x = s_new.equals(t_new); // always use equals method for strings because of reference shit.
        System.out.println(x);
    }
}
