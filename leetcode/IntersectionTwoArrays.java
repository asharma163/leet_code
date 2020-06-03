package leetcode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int e: nums1
             ) {
            set1.add(e);
        }
        for (int i: nums2
        ) {
            set2.add(i);
        }
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for (Integer num: set1) {
            result[i++] = num;
        }
    }
}
