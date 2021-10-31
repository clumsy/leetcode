package leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Problem733Test {
    private final Problem733 solution = new Problem733();

    @Test
    public void example1() {
        int[][] image = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };
        assert Arrays.deepEquals(solution.floodFill(image, 1, 1, 2),
            new int[][] {
                {2,2,2},
                {2,2,0},
                {2,0,1}
            });
    }

    @Test
    public void example2() {
        int[][] image = {
            {0,0,0},
            {0,1,1}
        };
        assert Arrays.deepEquals(solution.floodFill(image, 1, 1, 1),
            new int[][] {
                {0,0,0},
                {0,1,1}
            });
    }
}
