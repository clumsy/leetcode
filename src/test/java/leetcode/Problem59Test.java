package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem59Test {
    private final Problem59 solution = new Problem59();

    @Test
    public void example1() {
        assert Arrays.deepEquals(solution.generateMatrix(3),
            new int[][] {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
            });
    }

    @Test
    public void example2() {
        assert Arrays.deepEquals(solution.generateMatrix(1),
            new int[][] {
                {1}
            });
    }
}
