package leetcode;

import java.util.ArrayList;

public class Parity2 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int[] arr = {4,2,5,7};
        ArrayList<Integer> listEven = new ArrayList<>();
        ArrayList<Integer> listOdd = new ArrayList<>();
        ArrayList<Integer> finalOne = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                listEven.add(arr[i]);
            }
            else listOdd.add(arr[i]);
        }
        for(int j = 0; j < arr.length; j++) {
            if(j % 2 == 0) {
                finalOne.add(listEven.get(even));
                even++;
            }
            else {
                finalOne.add(listOdd.get(odd));
                odd++;
            }
        }
        System.out.println(finalOne);
    }
}
