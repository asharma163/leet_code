package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1);
        }
//        map.entrySet().forEach(entry->{
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.println(i);
            }
        }
    }
}
