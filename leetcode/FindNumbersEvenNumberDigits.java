package leetcode;

import java.util.ArrayList;

public class FindNumbersEvenNumberDigits {
    public static void main(String[] args) {
        int counter = 0;
        int burrah = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {12,345,2,6,7896};
        for (int i = 0 ; i < arr.length; i++) {
            while (arr[i] > 0) {
                counter++;
                arr[i] /= 10;
            }
            list.add(counter);
            counter = 0;
        }
        for (Integer e: list
             ) {
            if (e % 2 == 0) {
                burrah++;
            }
        }
        System.out.println(burrah);
    }
}
