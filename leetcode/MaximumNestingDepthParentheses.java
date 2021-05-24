public class MaximumNestingDepthParentheses {
    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        int MAX = 0;
        int counter = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                counter++;
                MAX = Math.max(MAX, counter);
            } else if (ch == ')') counter--;
        }
        System.out.println(MAX);
    }
}
