package leetcode;

import java.util.Arrays;

public class MaximumProductTwoElementsArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int[] new_arr = nums.clone();
        Arrays.sort(new_arr);
        // this solution is great for the +ve numbers
        // int product = (new_arr[new_arr.length - 1] - 1) * (new_arr[new_arr.length - 2] - 1);
        // System.out.println(product);
        // taking into consideration -ve numbers
        int first = new_arr[0] - 1;
        int second = new_arr[1] - 1;
        int prod_first_second = first * second;
        int prod_second_last_last =  (new_arr[new_arr.length - 1] - 1) * (new_arr[new_arr.length - 2] - 1);
        System.out.println(Math.max(prod_first_second,prod_second_last_last));

    }
}
