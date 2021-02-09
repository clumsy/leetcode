package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem274Test {
    private final Problem274 solution = new Problem274();

    @Test
    public void example1() {
        assertThat(solution.hIndex(new int[] {3,0,6,1,5}), is(3));
    }

    @Test
    public void example2() {
        assertThat(solution.hIndex(new int[] {1,1}), is(1));
    }
}
