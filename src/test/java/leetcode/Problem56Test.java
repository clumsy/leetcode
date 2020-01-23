package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem56Test {
    protected Problem56 solution = new Problem56();

    public static final class AlternativeTest extends Problem56Test {
        {
            this.solution = new Problem56.Alternative();
        }
    }

    @Test
    public void empty() {
        assertThat(solution.merge(new int[][] {}),
            is(new int[][] {}));
    }

    @Test
    public void complex() {
        assertThat(solution.merge(new int[][] {{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4,6}}),
            is(new int[][] {{1, 3}, {4, 7}}));
    }

    @Test
    public void simple() {
        assertThat(solution.merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}}),
            is(new int[][] {{1, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    public void small() {
        assertThat(solution.merge(new int[][] {{1, 4}, {4, 5}}),
            is(new int[][] {{1, 5}}));
    }
}
