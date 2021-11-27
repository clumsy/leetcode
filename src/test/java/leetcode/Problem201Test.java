package leetcode;

import org.junit.Test;

public class Problem201Test {
    private final Problem201 solution = new Problem201();

    @Test
    public void example1() {
        assert solution.rangeBitwiseAnd(1, 1) == 1;
    }

    @Test
    public void example2() {
        assert solution.rangeBitwiseAnd(5, 7) == 4;
    }

    @Test
    public void example3() {
        assert solution.rangeBitwiseAnd(5, 8) == 0;
    }

    @Test
    public void example4() {
        assert solution.rangeBitwiseAnd(0, 1) == 0;
    }

    @Test
    public void example5() {
        assert solution.rangeBitwiseAnd(0, 2147483647) == 0;
    }

    @Test
    public void example6() {
        assert solution.rangeBitwiseAnd(2147483646, 2147483647) == 2147483646;
    }
}
