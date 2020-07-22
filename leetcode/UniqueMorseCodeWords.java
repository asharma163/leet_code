package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character,String> map = new HashMap<>();
        int counter = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c,morse[counter]);
            counter++;
        }

        String[] words = {"gin", "zen", "gig", "msg"};
        String f = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                f += map.get(words[i].charAt(j));
            }
            set.add(f);
            f = "";
        }
        System.out.println(set.size());
    }
}
