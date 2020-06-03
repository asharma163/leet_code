package leetcode;

import java.util.ArrayList;

public class HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int count = 0;
        int[] new_arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            new_arr[i] = count;
            count = 0;
        }
        for (int i : new_arr
             ) {
            System.out.println(i);
        }
    }
}
