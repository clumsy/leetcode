package leetcode;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class Problem228Test {
    private final Problem228 solution = new Problem228();

    @Test
    public void example1() {
        assertThat(solution.summaryRanges(new int[] {0,1,2,4,5,7}),
            is(Arrays.asList("0->2","4->5","7")));
    }

    @Test
    public void example2() {
        assertThat(solution.summaryRanges(new int[] {0,2,3,4,6,8,9}),
            is(Arrays.asList("0","2->4","6","8->9")));
    }

    @Test
    public void example3() {
        assertThat(solution.summaryRanges(new int[] {}),
            is(Arrays.asList()));
    }
}
