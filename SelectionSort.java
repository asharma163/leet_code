package leetcode;

public class SelectionSort {
    public static void main(String [] args) {
        int[] array = {7,8,4,6,88,3};
        selectionSort(array);
    }

    private static void  selectionSort(int[] accept) {
        int length = accept.length;
        for(int i = 0; i < length - 1; i++) {
            int lowest = i;
            for(int j = i+1; j < length; j++) {
                if(accept[j] < accept[lowest]) {
                    lowest = j;
                }
                    int temp = accept[lowest];
                    accept[lowest] = accept[i];
                    accept[i] = temp;



            }
        }
        for(int i = 0; i < length; ++i) {
            System.out.println(accept[i]);
        }

    }
}
