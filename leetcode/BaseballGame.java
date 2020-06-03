package leetcode;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        int running_total = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                stack.pop();
            } else if (ops[i].equals("D")) {
                int interim = stack.peek();
                interim *= 2;
                stack.push(interim);
            } else if (ops[i].equals("+")) {
                int first = stack.pop();
                int second = stack.peek();
                int sum = first + second;
                stack.push(first);
                stack.push(sum);
            } else {
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        for (Integer x : stack) {
            running_total += x;
        }
        System.out.println(running_total);
    }
}
