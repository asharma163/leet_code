package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountNumberConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (Character c : allowed.toCharArray()) {
            set.add(c);
        }

        for (String word : words) {
            boolean flag = true;
            for (int j = 0; j < word.length(); j++) {
                if (!set.contains(word.charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) count += 1;
        }
        System.out.println(count);
    }
}
