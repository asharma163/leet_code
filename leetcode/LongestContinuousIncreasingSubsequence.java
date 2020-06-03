package leetcode;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        int longest = 1;
        int current_longest = 1;
        if (nums.length == 0) {
            longest = 0;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i+1]) {
                    longest++;
                } else {
                    longest = 1;
                }
                current_longest = Math.max(longest, current_longest);
            }
        }
        System.out.println(current_longest);
    }
}
