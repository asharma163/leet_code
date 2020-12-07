package leetcode;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,8,4,6,88,3,99};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] accept) {
        int length = accept.length;
        for(int i = length - 1; i > 0 ; i--) {
            for(int j = 0; j < length-1; j++) {
                if(accept[j] > accept[j+1]) {
                    int swap = accept[j];
                    accept[j] = accept[j+1];
                    accept[j+1] = swap;
                }
            }
        }
        for (int j : accept) {
            System.out.println(j);
        }

    }
}
