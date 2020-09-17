package leetcode;

public class FindNUniqueIntegersSumZero {
    public static void main(String[] args) {
        int n = 5;
        int[] array = new int[n];
        int counter = 0;
        int sum = 0;
        for(int i = 1; i <= n - 1; i++) {
            array[counter] = i;
            sum += i;
            counter++;
        }
        array[n - 1] = -sum;
        for (Integer e : array
             ) {
            System.out.println(e);
        }
    }
}
