package leetcode;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem15Test {
    private Problem15 solution = new Problem15();

    @Test
    public void simple() {
        assertThat(solution.threeSum(new int[] {-1, 0, 1, 2, -1, -4}), is(asList(asList(-1, -1, 2), asList(-1, 0, 1))));
    }

    @Test
    public void zeroes() {
        assertThat(solution.threeSum(new int[] {0, 0, 0, 0}), is(singletonList(asList(0, 0, 0))));
    }
}
