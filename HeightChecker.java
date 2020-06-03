package leetcode;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int counter = 0;
        int[] arr = {1,1,4,2,1,3};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        Arrays.sort(newArr);
        for (int j = 0; j < newArr.length; j++) {
            if(arr[j] != newArr[j]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
