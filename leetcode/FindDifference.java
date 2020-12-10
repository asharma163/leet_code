package leetcode;

public class FindDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            sum -= (int) t.charAt(i);
        }

        System.out.println((char) Math.abs(sum));
    }
}
