package leetcode;

import org.junit.Test;

public class Problem322Test {
    private final Problem322 solution = new Problem322();
    
    @Test
    public void example1() {
        int[] coins = {1, 2, 5};
        assert solution.coinChange(coins, 11) == 3;
    }
    
    @Test
    public void example2() {
        int[] coins = {2};
        assert solution.coinChange(coins, 3) == -1;
    }
}
