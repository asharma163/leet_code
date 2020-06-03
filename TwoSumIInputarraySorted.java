package leetcode;

public class TwoSumIInputarraySorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int index1 = 0, index2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    index1 = i+1;
                    index2 = j+1;
                }
            }
        }
        System.out.println(index1 + " --------- " + index2);
    }
}
