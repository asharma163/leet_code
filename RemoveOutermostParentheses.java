package leetcode;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        StringBuilder sb = new StringBuilder();
        int count_open = 0;
        int count_close = 0;
        int initial = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '('){
                count_open++;
            } else {
                count_close++;
            }
            if (count_open == count_close) {
                sb.append(s, initial + 1, i);
                initial = 1 + i;
            }
        }
        System.out.println(sb.toString());
    }
}
