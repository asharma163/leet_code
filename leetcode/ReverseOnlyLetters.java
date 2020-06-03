package leetcode;

import java.util.Stack;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        Stack<Character> stack = new Stack<>();
        char[] chr = s.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if (Character.isLetter(chr[i])) stack.push(chr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)){
                sb.append(stack.pop());
            } else sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
