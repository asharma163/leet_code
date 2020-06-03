package leetcode;

import java.util.*;

public class UniqueNumberOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        Map<Integer, Integer> map = new HashMap<>();
        for (int e: arr
             ) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        System.out.println(map.size() == set.size());
    }
}
