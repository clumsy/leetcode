package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem733Test {
    private final Problem733 solution = new Problem733();

    @Test
    public void example1() {
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        assertThat(solution.floodFill(image, 1, 1, 2),
            is(new int[][] {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
            }));
    }

    @Test
    public void example2() {
        int[][] image = {
            {0, 0, 0},
            {0, 1, 1}
        };
        assertThat(solution.floodFill(image, 1, 1, 1),
            is(new int[][] {
                {0, 0, 0},
                {0, 1, 1}
            }));
    }
}
