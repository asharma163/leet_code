package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        Arrays.sort(nums);
        int third_biggest = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(Integer e : nums) {
            if (!stack.contains(e)) {
                stack.push(e);
            }
        }
        if (stack.size() > 2) {
            stack.pop();
            stack.pop();
        }
        third_biggest = stack.pop();
        System.out.println(third_biggest);
    }
}
