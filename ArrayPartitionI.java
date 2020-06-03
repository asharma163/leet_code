package leetcode;

import java.util.Arrays;

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i+=2) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
