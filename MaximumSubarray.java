package leetcode;

public class MaximumSubarray {
    public static void main(String[] args) {
        // Implementing Kadane's Algo
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int current_max = nums[0];
        int global_max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current_max = Math.max(nums[i], current_max + nums[i]);
            if (current_max > global_max) {
                global_max = current_max;
            }
        }
        System.out.println(global_max);
    }
}
