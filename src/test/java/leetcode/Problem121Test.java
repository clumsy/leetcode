package leetcode;

import org.junit.Test;

public class Problem121Test {
    private final Problem121 solution = new Problem121();
    
    @Test
    public void example1() {
        int[] prices = {7,1,5,3,6,4};
        assert solution.maxProfit(prices) == 5;
    }
    
    @Test
    public void example2() {
        int[] prices = {7,6,4,3,1};
        assert solution.maxProfit(prices) == 0;
    }
}
