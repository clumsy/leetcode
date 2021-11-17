package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.DYNAMIC_PROGRAMMING)
@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem309 {
    public int maxProfit(int[] prices) {
        int buy;
        int buy_minus_1 = -prices[0]; // bought on day 1
        int sell = 0;
        int sell_minus_1 = 0;
        int sell_minus_2 = 0;
        for (int price : prices) {
            buy = Math.max(buy_minus_1, sell_minus_2 - price); // held or bought today after cool-down
            sell = Math.max(sell_minus_1, buy_minus_1 + price); // sold previously or today
            buy_minus_1 = buy;
            sell_minus_2 = sell_minus_1;
            sell_minus_1 = sell;
        }
        return sell;
    }
}
