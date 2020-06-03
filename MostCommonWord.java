package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String new_paragraph = paragraph.replaceAll("[\\!?',;.]", " ").replace("  ", " ").toLowerCase().trim();
        System.out.println(new_paragraph);
        String[] str = new_paragraph.split(" ");
        String[] banned = {"a"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            map.put(str[i],map.getOrDefault(str[i],0) + 1);
        }

        for (String x : banned
             ) {
            map.remove(x);
        }
        int maxValueInMap=(Collections.max(map.values()));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
    }
}
