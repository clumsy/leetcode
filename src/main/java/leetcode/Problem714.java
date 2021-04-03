package leetcode;

@BeatsPercent(90.50)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int without = 0;
        int with = -prices[0];
        for (int i = 1; i < n; i++) {
            without = Math.max(without, with + prices[i] - fee); // either didn't have any or just sold
            with = Math.max(with, without - prices[i]); // either had before or just bought
        }
        return Math.max(with, without);
    }
}
