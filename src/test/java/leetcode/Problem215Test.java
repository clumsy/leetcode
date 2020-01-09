package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem215Test {
    private final Problem215 solution = new Problem215();

    @Test
    public void simple() {
        assertThat(solution.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2), is(5));
    }

    @Test
    public void bigger() {
        assertThat(solution.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4), is(4));
    }
}
