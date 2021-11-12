package leetcode;

import org.junit.Test;

public class Problem11Test {
    private final Problem11 solution = new Problem11();

    @Test
    public void example1() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        assert solution.maxArea(height) == 49;
    }

    @Test
    public void example2() {
        int[] height = {1,1};
        assert solution.maxArea(height) == 1;
    }

    @Test
    public void example3() {
        int[] height = {4,3,2,1,4};
        assert solution.maxArea(height) == 16;
    }

    @Test
    public void example4() {
        int[] height = {1,2,1};
        assert solution.maxArea(height) == 2;
    }
}
