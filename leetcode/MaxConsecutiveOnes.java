package leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int one_count = 0, counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            } else counter = 0;
            one_count = (one_count < counter) ? counter : one_count;
        }
        System.out.println(one_count);
    }
}
