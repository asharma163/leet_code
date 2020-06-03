package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a: arr
             ) {
            map.put(a,map.getOrDefault(a,0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
            if (entry.getValue() > 0.25 * arr.length) {
                result = entry.getKey();
            }
        }
        System.out.println(result);
    }
}
