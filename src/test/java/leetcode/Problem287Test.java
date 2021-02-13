package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem287Test {
    private final Problem287 solution = new Problem287();

    @Test
    public void example1() {
        assertThat(solution.findDuplicate(new int[] {1,3,4,2,2}), is(2));
    }
}
