package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] A = {0,3,2,1};
        boolean flag = false;
        int temp = -1;
        Set<Integer> set = new HashSet<>();
        if (A.length < 3) {
            flag = false;
        } else {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] < A[i + 1]) {
                    set.add(1);
                } else {
                    temp = i;
                    break;
                }
            }
            if(temp != -1) {
                for (int j = temp; j < A.length - 1; j++) {
                    if (A[j] > A[j + 1]) {
                        set.add(2);
                    } else {
                        set.add(3);
                    }
                }
            }

            flag = set.contains(3) || set.size() == 1 ? false : true;
        }
        System.out.println(flag);
    }
}
