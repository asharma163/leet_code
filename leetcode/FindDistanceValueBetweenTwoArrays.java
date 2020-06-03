package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,4,2,3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int d = 3;
        boolean flag = false;
        int counter = 0;

        for (int i = 0; i < arr1.length; i++) {
            List<Boolean> list = new ArrayList<>();
            for (int j = 0; j < arr2.length; j++) {
                if(Math.abs(arr1[i] - arr2[j]) <= d) {
                    list.add(true);
                }
            }
            if (list.size() == 0) counter++;
        }

        System.out.println(counter);
    }
}
