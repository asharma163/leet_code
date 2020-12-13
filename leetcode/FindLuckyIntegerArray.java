package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FindLuckyIntegerArray {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4};
        int result = -1;
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                stack.push(entry.getKey());
            }
            if (stack.size() > 0) {
                result = stack.peek();
            } else{
                result = -1;
            }
        }
        System.out.println(result);
    }
}
