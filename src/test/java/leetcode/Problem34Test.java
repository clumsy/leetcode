package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem34Test {
    private Problem34 solution = new Problem34();

    @Test
    public void simple() {
        assertThat(solution.searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8), is(new int[] {3, 4}));
    }

    @Test
    public void empty() {
        assertThat(solution.searchRange(new int[0], 0), is(new int[] {-1, -1}));
    }

    @Test
    public void singleMissing() {
        assertThat(solution.searchRange(new int[] {1}, 0), is(new int[] {-1, -1}));
    }

    @Test
    public void singlePreset() {
        assertThat(solution.searchRange(new int[] {1}, 1), is(new int[] {0, 0}));
    }

    @Test
    public void doublePreset() {
        assertThat(solution.searchRange(new int[] {2, 2}, 2), is(new int[] {0, 1}));
    }

    @Test
    public void singleMatch() {
        assertThat(solution.searchRange(new int[] {1, 3}, 1), is(new int[] {0, 0}));
    }

    @Test
    public void doubleMatch() {
        assertThat(solution.searchRange(new int[] {1, 1, 2}, 1), is(new int[] {0, 1}));
    }

    @Test
    public void tripleMatch() {
        assertThat(solution.searchRange(new int[] {3, 3, 3}, 3), is(new int[] {0, 2}));
    }
}
