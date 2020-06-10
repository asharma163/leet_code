package leetcode;

import java.util.ArrayList;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int counter = n;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(nums[i]);
            list.add(nums[counter]);
            counter++;
        }
        System.out.println(list);
    }
}
