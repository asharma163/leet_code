package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementSize2NArray {
    public static void main(String[] args) {
        int[] A = {2,1,2,5,3,2};
        int repeat_number = A.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : A
             ) {
            map.put(e, map.getOrDefault(e,0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == repeat_number) {
                System.out.println(entry.getKey());
            }
        }
    }
}
