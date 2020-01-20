package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem33Test {
    private Problem33 solution = new Problem33();

    @Test
    public void present() {
        assertThat(solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0), is(4));
    }

    @Test
    public void simple() {
        assertThat(solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3), is(-1));
    }

    @Test
    public void empty() {
        assertThat(solution.search(new int[0], 5), is(-1));
    }

    @Test
    public void singleton() {
        assertThat(solution.search(new int[] {1}, 0), is(-1));
    }

    @Test
    public void another() {
        assertThat(solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0), is(4));
    }

    @Test
    public void weird() {
        assertThat(solution.search(new int[] {1, 3, 5}, 3), is(1));
    }

    @Test
    public void bigger() {
        assertThat(solution.search(new int[] {7, 8, 1, 2, 3, 4, 5, 6}, 2), is(3));
    }

    @Test
    public void weirder() {
        assertThat(solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 5), is(1));
    }
}
