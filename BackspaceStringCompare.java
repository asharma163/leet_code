package leetcode;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        Stack<Character> stack_S = new Stack<>();
        Stack<Character> stack_T = new Stack<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '#') {
                stack_S.push(S.charAt(i));
            } else if(!stack_S.empty()){
                stack_S.pop();
            }
        }

        for (int j = 0; j < T.length(); j++) {
            if (T.charAt(j) != '#') {
                stack_T.push(T.charAt(j));
            } else if(!stack_T.empty()){
                stack_T.pop();
            }
        }
        System.out.println(stack_S.toString().equals(stack_T.toString()));
    }
}
