package leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(pass(s));
    }

    public static String pass(String accept) {
        Stack<Character> stack = new Stack<>();
        for (char x : accept.toCharArray()) {
            if (!stack.isEmpty() && x == stack.peek()) {
                stack.pop();
            } else {
                stack.push(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
