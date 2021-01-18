package leetcode;

import java.util.HashSet;
import java.util.Set;

public class DetermineStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        int counter = 0;
        String a  = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for (int i = 0; i < a.length(); i++) {
            if (set.contains(a.charAt(i))) {
                counter++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (set.contains(b.charAt(i))) {
                counter--;
            }
        }
        System.out.println(counter);
    }
}
