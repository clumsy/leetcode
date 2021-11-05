package leetcode;

import org.junit.Test;

public class Problem70Test {
    private final Problem70 solution = new Problem70();

    @Test
    public void example1() {
        assert solution.climbStairs(2) == 2;
    }

    @Test
    public void example2() {
        assert solution.climbStairs(3) == 3;
    }
}
