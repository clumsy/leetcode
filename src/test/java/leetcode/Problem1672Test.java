package leetcode;

import org.junit.Test;

public class Problem1672Test {
    private final Problem1672 solution = new Problem1672();
    
    @Test
    public void example1() {
        int[][] accounts = {
            {1,2,3},
            {3,2,1},
        };
        assert solution.maximumWealth(accounts) == 6;
    }
    
    @Test
    public void example2() {
        int[][] accounts = {
            {1,5},
            {7,3},
            {3,5},
        };
        assert solution.maximumWealth(accounts) == 10;
    }
    
    @Test
    public void example3() {
        int[][] accounts = {
            {2,8,7},
            {7,1,3},
            {1,9,5},
        };
        assert solution.maximumWealth(accounts) == 17;
    }
}
