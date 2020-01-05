package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem16Test {
    private Problem16 solution = new Problem16();

    @Test
    public void simple() {
        assertThat(solution.threeSumClosest(new int[] {-1, 2, 1, -4}, 1), is(2));
    }

    @Test
    public void small() {
        assertThat(solution.threeSumClosest(new int[] {0, 1, 2}, 3), is(3));
    }

    @Test
    public void big() {
        assertThat(solution.threeSumClosest(new int[] {1, 1, 1, 0}, 100), is(3));
    }
}
