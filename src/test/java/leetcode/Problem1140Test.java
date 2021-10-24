package leetcode;

import org.junit.Test;

public class Problem1140Test {
    private final Problem1140 solution = new Problem1140();
    
    @Test
    public void example1() {
        int[] piles = {2,7,9,4,4};
        assert solution.stoneGameII(piles) == 10;
    }
    
    @Test
    public void example2() {
        int[] piles = {1,2,3,4,5,100};
        assert solution.stoneGameII(piles) == 104;
    }
}
