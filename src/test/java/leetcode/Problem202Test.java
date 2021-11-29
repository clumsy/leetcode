package leetcode;

import org.junit.Test;

public class Problem202Test {
    private final Problem202 solution = new Problem202();

    @Test
    public void example1() {
        assert solution.isHappy(19);
    }

    @Test
    public void example2() {
        assert !solution.isHappy(2);
    }
}
