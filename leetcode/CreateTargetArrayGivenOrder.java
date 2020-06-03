package leetcode;

import java.util.ArrayList;

public class CreateTargetArrayGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j <= i; j++) {
                list.add(index[j],nums[i]);
            }
        }
        System.out.println(list);
    }
}
