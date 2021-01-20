package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem210Test {
    private final Problem210 solution = new Problem210();

    @Test
    public void example1() {
        int[][] prerequisites = new int[][] {
            {1, 0}
        };
        assertThat(solution.findOrder(2, prerequisites), is(new int[] {0, 1}));
    }

    @Test
    public void example2() {
        int[][] prerequisites = new int[][] {
            {1, 0},
            {2, 0},
            {3, 1},
            {3, 2}
        };
        assertThat(solution.findOrder(4, prerequisites), is(new int[] {0, 1, 2, 3}));
    }

    @Test
    public void example3() {
        int[][] prerequisites = new int[][] {};
        assertThat(solution.findOrder(1, prerequisites), is(new int[] {0}));
    }

    @Test
    public void example4() {
        int[][] prerequisites = new int[][] {
            {0, 1},
            {0, 2},
            {1, 2},
        };
        assertThat(solution.findOrder(3, prerequisites), is(new int[] {2, 1, 0}));
    }

    @Test
    public void example5() {
        int[][] prerequisites = new int[][] {
            {0, 1},
            {1, 0}
        };
        assertThat(solution.findOrder(2, prerequisites), is(new int[0]));
    }

    @Test
    public void example6() {
        int[][] prerequisites = new int[][] {
            {1, 0},
            {1, 2},
            {0, 1}
        };
        assertThat(solution.findOrder(3, prerequisites), is(new int[0]));
    }
}
