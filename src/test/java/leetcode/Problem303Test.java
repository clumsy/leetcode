package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem303Test {
    private final Problem303 solution = new Problem303();

    @Test
    public void example1() {
        Problem303.NumArray numArray = solution.new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertThat(numArray.sumRange(0, 2), is(1));
        assertThat(numArray.sumRange(2, 5), is(-1));
        assertThat(numArray.sumRange(0, 5), is(-3));
    }
}
