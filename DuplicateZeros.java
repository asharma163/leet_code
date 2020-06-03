package leetcode;

import java.util.ArrayList;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : arr) {
            if (value != 0) {
                list.add(value);
            } else if (value == 0) {
                list.add(value);
                list.add(0);
            }
        }
        int[] new_arr = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            new_arr[j] = list.get(j);
        }
        for (Integer e: new_arr
             ) {
            System.out.println(e);
        }
    }
}
