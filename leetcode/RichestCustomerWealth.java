package leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int max = Integer.MIN_VALUE;
        for (int[] e : accounts) {
            max = Math.max(max, computeSum(e));
        }
        System.out.println(max);
    }

    public static int computeSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
