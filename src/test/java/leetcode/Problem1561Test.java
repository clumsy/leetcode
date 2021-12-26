package leetcode;

import org.junit.Test;

public class Problem1561Test {
    private final Problem1561 solution = new Problem1561();
    
    @Test
    public void example1() {
        int[] piles = {2,4,1,2,7,8};
        assert solution.maxCoins(piles) == 9;
    }
    
    @Test
    public void example2() {
        int[] piles = {2,4,5};
        assert solution.maxCoins(piles) == 4;
    }
    
    @Test
    public void example3() {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        assert solution.maxCoins(piles) == 18;
    }
}
