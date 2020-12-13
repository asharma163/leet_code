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

        for (int k : arr1) {
            List<Boolean> list = new ArrayList<>();
            for (int i : arr2) {
                if (Math.abs(k - i) <= d) {
                    list.add(true);
                }
            }
            if (list.size() == 0) counter++;
        }

        System.out.println(counter);
    }
}
