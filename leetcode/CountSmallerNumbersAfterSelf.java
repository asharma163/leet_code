package leetcode;

import java.util.ArrayList;

public class CountSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            list.add(count);
            count = 0;
        }
        System.out.println(list);
    }
}
