package leetcode;

import org.junit.Test;

public class Problem343Test {
    private final Problem343 solution = new Problem343();

    @Test
    public void example1() {
        assert solution.integerBreak(2) == 1;
    }

    @Test
    public void example2() {
        assert solution.integerBreak(10) == 36;
    }
}
