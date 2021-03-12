package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem1051Test {
    private final Problem1051 solution = new Problem1051();

    @Test
    public void example1() {
        assertThat(solution.heightChecker(new int[] {1,1,4,2,1,3}), is(3));
    }

    @Test
    public void example2() {
        assertThat(solution.heightChecker(new int[] {5,1,2,3,4}), is(5));
    }

    @Test
    public void example3() {
        assertThat(solution.heightChecker(new int[] {1,2,3,4,5}), is(0));
    }
}
