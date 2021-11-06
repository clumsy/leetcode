package leetcode;

import org.junit.Test;

public class Problem231Test {
    private final Problem231 solution = new Problem231();

    @Test
    public void example1() {
        assert solution.isPowerOfTwo(1);
    }

    @Test
    public void example2() {
        assert solution.isPowerOfTwo(16);
    }

    @Test
    public void example3() {
        assert !solution.isPowerOfTwo(3);
    }

    @Test
    public void example4() {
        assert solution.isPowerOfTwo(4);
    }

    @Test
    public void example5() {
        assert !solution.isPowerOfTwo(5);
    }

    @Test
    public void example6() {
        assert !solution.isPowerOfTwo(0);
    }

    @Test
    public void example7() {
        assert !solution.isPowerOfTwo(Integer.MIN_VALUE);
    }
}
