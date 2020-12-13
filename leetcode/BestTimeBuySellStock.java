package leetcode;

public class BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
            }
        }
        System.out.println(max);
    }
}
