package leetcode;

public class best_time_to_buy_and_sell_stock {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }

            if (prices[i] > min) {
                int profit = prices[i] - min;
                max = Math.max(max, profit);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
