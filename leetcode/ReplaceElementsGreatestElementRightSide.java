package leetcode;

public class ReplaceElementsGreatestElementRightSide {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int big = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                big = Math.max(arr[j], big);
            }
            arr[i] = big;
            big = Integer.MIN_VALUE;
        }
        arr[arr.length - 1] = -1;
        for (Integer e : arr
             ) {
            System.out.println(e);
        }
    }
}
