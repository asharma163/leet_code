package leetcode;

import java.util.Stack;

public class ReverseVowelsString {
    public static void main(String[] args) {
        String s = "leetcode";
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                stack.push(ch[i]);
            }
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                //stack.push(ch[i]);
                ch[i] = stack.pop();
            }
        }
        String final_str = new String(ch);
        System.out.println(final_str);
    }
}
