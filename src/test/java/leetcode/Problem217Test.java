package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem217Test {
    private final Problem217 solution = new Problem217();

    @Test
    public void example1() {
        assertThat(solution.containsDuplicate(new int[] {1,2,3,1}), is(true));
    }

    @Test
    public void example2() {
        assertThat(solution.containsDuplicate(new int[] {1,2,3,4}), is(false));
    }

    @Test
    public void example3() {
        assertThat(solution.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}), is(true));
    }
}
