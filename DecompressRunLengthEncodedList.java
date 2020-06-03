package leetcode;

import java.util.ArrayList;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i+=2) {
            int freq = nums[i];
            int val = nums[i+1];
            for (int j = 1; j <= freq; j++) {
                list.add(val);
            }
        }
        System.out.println(list);
    }
}
