package leetcode;

import java.util.ArrayList;

public class Parity {
    public static void main(String[] args) {
        int[] arr = {4,2,7,3,9,1,6,34};
        ArrayList<Integer> listEven = new ArrayList<>();
        ArrayList<Integer> listOdd = new ArrayList<>();
        for (int j : arr) {
            if (j % 2 == 0) {
                listEven.add(j);
            } else listOdd.add(j);
        }
        listEven.addAll(listOdd);
        System.out.println(listEven);
    }

}
