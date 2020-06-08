package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int[] new_nums = new int[nums.length];
        int counter = 0;
        int final_counter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer x : nums) {
            new_nums[counter] = x;
            counter++;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != new_nums[i]) {
                list.add(i);
            }
        }
        if (list.size() != 0) {
            final_counter = list.get(list.size() - 1) - list.get(0) + 1;
        }
        System.out.println(final_counter);
    }
}
