package leetcode;

@BeatsPercent(42.74)
@TimeComplexity(Complexity.LINEAR_N)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem123 {
    public int maxProfit(int[] prices) {
        int one_buy = Integer.MAX_VALUE;
        int one_buy_one_sell = 0;
        int two_buy = Integer.MAX_VALUE;
        int two_buy_two_sell = 0;
        for (int price : prices) {
            one_buy = Math.min(one_buy, price);
            one_buy_one_sell = Math.max(one_buy_one_sell, price - one_buy);
            two_buy = Math.min(two_buy, price - one_buy_one_sell);
            two_buy_two_sell = Math.max(two_buy_two_sell, price - two_buy);
        }
        return two_buy_two_sell;
    }
}
