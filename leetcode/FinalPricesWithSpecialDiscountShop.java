package leetcode;

public class FinalPricesWithSpecialDiscountShop {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        for (Integer e : prices
             ) {
            System.out.println(e);
        }
    }
}
