package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem167Test {
    private final Problem167 solution = new Problem167();

    @Test
    public void example1() {
        assert Arrays.equals(solution.twoSum(new int[]{2,7,11,15}, 9), new int[] {1,2});
    }

    @Test
    public void example2() {
        assert Arrays.equals(solution.twoSum(new int[]{2,3,4}, 6), new int[] {1,3});
    }

    @Test
    public void example3() {
        assert Arrays.equals(solution.twoSum(new int[]{-1,0}, -1), new int[] {1,2});
    }
}
