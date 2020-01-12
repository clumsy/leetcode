package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem215Test {
    protected Problem215 solution = new Problem215();

    public static final class AlternativeTest extends Problem215Test {
        {
            this.solution = new Problem215.Alternative();
        }
    }

    @Test
    public void simple() {
        assertThat(solution.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2), is(5));
    }

    @Test
    public void bigger() {
        assertThat(solution.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4), is(4));
    }
}
