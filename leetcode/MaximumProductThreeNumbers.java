package leetcode;

import java.util.Arrays;

public class MaximumProductThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-1, -2, -7};
        Arrays.sort(nums);
        System.out.println(Math.max((nums[0] * nums[1] * nums[nums.length - 1]), (nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3])));
    }
}
