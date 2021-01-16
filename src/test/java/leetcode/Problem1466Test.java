package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1466Test {
    private final Problem1466 solution = new Problem1466();

    @Test
    public void example1() {
        int[][] connections = new int[][] {
            {0,1},
            {1,3},
            {2,3},
            {4,0},
            {4,5},
        };
        assertThat(solution.minReorder(6, connections), is(3));
    }

    @Test
    public void example2() {
        int[][] connections = new int[][] {
            {1,0},
            {1,2},
            {3,2},
            {3,4}
        };
        assertThat(solution.minReorder(5, connections), is(2));
    }

    @Test
    public void example3() {
        int[][] connections = new int[][] {
            {1,0},
            {2,0}
        };
        assertThat(solution.minReorder(3, connections), is(0));
    }
}
