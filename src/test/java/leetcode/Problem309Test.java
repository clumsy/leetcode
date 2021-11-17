package leetcode;

import org.junit.Test;

public class Problem309Test {
    private final Problem309 solution = new Problem309();
    
    @Test
    public void example1() {
        int[] prices = {1,2,3,0,2};
        assert solution.maxProfit(prices) == 3;
    }
    
    @Test
    public void example2() {
        int[] prices = {1};
        assert solution.maxProfit(prices) == 0;
    }
}
