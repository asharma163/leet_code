package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class KidsWithGreatestNumberCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int[] new_candies = new int[candies.length];
        ArrayList<Boolean> list = new ArrayList<>();
        System.arraycopy(candies, 0, new_candies, 0, candies.length);
        int extraCandies = 3;
        Arrays.sort(new_candies);
        int largest = new_candies[new_candies.length - 1];
        for (Integer e : candies
             ) {
            if(e+extraCandies >= largest) {
                list.add(true);
            } else{
                list.add(false);
            }
        }
        System.out.println(list);
    }
}
