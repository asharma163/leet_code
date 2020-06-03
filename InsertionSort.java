package leetcode;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,4,6,88,3};
        insertionSort(arr);
    }

    public static void insertionSort(int[] accept) {
        int length = accept.length;
        for(int i = 1; i < length; i++) {
            int oneAtaTime = accept[i];

            int j;
            for(j = i; j > 0 && accept[j-1] > oneAtaTime; j--) {
                accept[j] = accept[j-1];
            }
            accept[j] = oneAtaTime;
        }
        for(int i = 0; i < length; ++i) {
            System.out.println(accept[i]);
        }
    }
}
