package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem11Test {
    private Problem11 solution = new Problem11();

    @Test
    public void simple() {
        assertThat(solution.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}), is(49));
    }
}
