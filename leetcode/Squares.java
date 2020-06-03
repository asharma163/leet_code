package leetcode;

import java.util.*;
public class Squares {
    public static void main(String[] args) {
        int[] arr = {-2,-5,6,3,7};
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            ar.add(arr[i]);
        }
        Collections.sort(ar);
        for(int j = 0; j < arr.length; j++) {
            ar.set(j, ar.get(j)*ar.get(j));
        }
        Collections.sort(ar);
        for(int j = 0; j < arr.length; j++) {
            System.out.println(ar.get(j));
        }

    }
}
