package leetcode;

public class ConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "j";
        int counter = 1;
        int max_length = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                counter++;
            } else {
                counter = 1;
            }
            max_length = Math.max(counter, max_length);
        }
        System.out.println(max_length);
    }
}
