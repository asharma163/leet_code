package leetcode;

public class SplitStringBalancedStrings {
    public static void main(String args) {
        String s = "RLRRLLRLRL";
        int counter = 0;
        int final_count = 0;
        for (char x : s.toCharArray()) {
            if (x == 'R') {
                counter++;
            } else counter--;
            if (counter == 0) {
                final_count++;
            }
        }
        System.out.println(final_count);
    }
}
