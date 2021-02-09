package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem268Test {
    private final Problem268 solution = new Problem268();

    @Test
    public void example1() {
        assertThat(solution.missingNumber(new int[] {3,0,1}), is(2));
    }

    @Test
    public void example2() {
        assertThat(solution.missingNumber(new int[] {0,1}), is(2));
    }

    @Test
    public void example3() {
        assertThat(solution.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}), is(8));
    }
}
