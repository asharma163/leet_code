package leetcode;

public class CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int counter = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt < 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
