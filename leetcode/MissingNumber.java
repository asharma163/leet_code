package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        Set<Integer> set = new HashSet<>();
        for (int e: arr
             ) {
            set.add(e);
        }
        for (int i = 0; i < arr.length + 1; i++) {
            if (! set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
