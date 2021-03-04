package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem162Test {
    private final Problem162 solution = new Problem162();

    @Test
    public void example1() {
        assertThat(solution.findPeakElement(new int[] {1,2,3,1}), is(2));
    }

    @Test
    public void example2() {
        assertThat(solution.findPeakElement(new int[] {1,2,1,3,5,6,4}), is(5));
    }
}
