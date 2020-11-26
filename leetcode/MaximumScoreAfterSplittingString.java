package leetcode;

public class MaximumScoreAfterSplittingString {
    public static void main(String[] args) {
        String s = "011101";
        int counter = 1;
        int max = Integer.MIN_VALUE;
        while (counter < s.length()) {
            String left = s.substring(0,counter);
            String right = s.substring(counter);
            max = Math.max(max,compute(left,right));
            counter++;
        }
        System.out.println(max);
    }

    public static int compute(String left, String right) {
        int sum = 0;
        // count 0's in left and 1's in right
        for (int i = 0; i < left.length(); i++) {
            if(left.charAt(i) == '0') {
                sum++;
            }
        }
        for (int i = 0; i < right.length(); i++) {
            if(right.charAt(i) == '1') {
                sum++;
            }
        }
        return sum;
    }
}
