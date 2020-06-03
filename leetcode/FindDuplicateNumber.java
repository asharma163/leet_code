package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
            }
        }
    }
}
