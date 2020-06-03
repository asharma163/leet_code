package leetcode;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
import org.jetbrains.annotations.NotNull;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,5,32,3,6,8};
        int target = 34;
        twoSun(arr, target);
    }

    public static void twoSun(int @NotNull [] accept, int target) {
        int length = accept.length - 1;

        for(int i =0; i < length; i++) {
            for(int j = i+1; j < length; j++) {
                if(accept[i]+accept[j] == target) {
                    System.out.println(i+","+j);
                }
            }
        }
    }
}
