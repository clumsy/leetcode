package leetcode;

import org.junit.Test;

public class Problem1823Test {
    private final Problem1823 solution = new Problem1823();
    
    @Test
    public void example1() {
        assert solution.findTheWinner(5,2) == 3;
    }
    
    @Test
    public void example2() {
        assert solution.findTheWinner(6,5) == 1;
    }
}
