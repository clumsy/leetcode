package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem179Test {
    private final Problem179 solution = new Problem179();

    @Test
    public void example1() {
        assertThat(solution.largestNumber(new int[] {10,2}), is("210"));
    }

    @Test
    public void example2() {
        assertThat(solution.largestNumber(new int[] {3,30,34,5,9}), is("9534330"));
    }

    @Test
    public void example3() {
        assertThat(solution.largestNumber(new int[] {1}), is("1"));
    }

    @Test
    public void example4() {
        assertThat(solution.largestNumber(new int[] {10}), is("10"));
    }
}
